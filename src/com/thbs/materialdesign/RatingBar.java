package com.thbs.materialdesign;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by divya_ravikumar on 05-08-2016.
 */

// To render graphical ui of rating bar, takes no of stars as constructor arg
public class RatingBar extends JPanel {

	public RatingBar(int rating) {
        ImageIcon defaultIcon = new ImageIcon(getClass().getResource("31g.png"));
        ImageProducer ip = defaultIcon.getImage().getSource();

        // 1
        List<ImageIcon> list = Arrays.asList(
                makeStarImageIcon(ip, .6f, .6f, 0f),
                makeStarImageIcon(ip, .7f, .7f, 0f),
                makeStarImageIcon(ip, .8f, .8f, 0f),
                makeStarImageIcon(ip, .9f, .9f, 0f),
                makeStarImageIcon(ip,  1f,  1f, 0f));

            add(makeStarRatingPanel(new RatingBar.LevelBar(defaultIcon, list, 2, rating)));

        setPreferredSize(new Dimension(100, 50));
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//createAndShowGUI();
	}

	class LevelBar extends JPanel implements MouseListener, MouseMotionListener {
	    private final int gap;
	    protected final List<ImageIcon> iconList;
	    protected final List<JLabel> labelList = Arrays.asList(
	        new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel()
	    );
	    protected final ImageIcon defaultIcon;
	    private int clicked = -1;

	    protected LevelBar(ImageIcon defaultIcon, List<ImageIcon> list, int gap, int rating) {
	        super(new GridLayout(1, 5, gap * 2, gap * 2));
	        this.defaultIcon = defaultIcon;
	        this.iconList = list;
	        this.gap = gap;
	        for (JLabel l: labelList) {
	            l.setIcon(defaultIcon);
	            add(l);
	        }
	        addMouseListener(this);
	        addMouseMotionListener(this);
	        repaintIcon(rating - 1);
	    }
	    public void clear() {
	        clicked = -1;
	        repaintIcon(clicked);
	    }
	    public int getLevel() {
	        return clicked;
	    }
	    public void setLevel(int l) {
	        clicked = l;
	        repaintIcon(clicked);
	    }
	    private int getSelectedIconIndex(Point p) {
	        for (int i = 0; i < labelList.size(); i++) {
	            Rectangle r = labelList.get(i).getBounds();
	            r.grow(gap, gap);
	            if (r.contains(p)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	    public void repaintIcon(int index) {
	        for (int i = 0; i < labelList.size(); i++) {
	            labelList.get(i).setIcon(i <= index ? iconList.get(i) : defaultIcon);
	        }
	        repaint();
	    }
	    @Override public void mouseMoved(MouseEvent e) {
	       // repaintIcon(getSelectedIconIndex(e.getPoint()));
	    }
	    @Override public void mouseEntered(MouseEvent e) {
	        //repaintIcon(getSelectedIconIndex(e.getPoint()));
	    }
	    @Override public void mouseClicked(MouseEvent e) {
	    	//clicked = getSelectedIconIndex(e.getPoint());
	    }
	    @Override public void mouseExited(MouseEvent e) {
	    	//System.out.println("Exited");
	       // repaintIcon(clicked);
	    }

	    @Override public void mouseDragged(MouseEvent e)  { /* not needed */ }
	    @Override public void mousePressed(MouseEvent e)  { /* not needed */ }
	    @Override public void mouseReleased(MouseEvent e) { /* not needed */ }

	}

	 private static ImageIcon makeStarImageIcon(ImageProducer ip, float rf, float gf, float bf) {
	        return new ImageIcon(Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(ip, new SelectedImageFilter(rf, gf, bf))));
	    }

	 private JPanel makeStarRatingPanel(final RatingBar.LevelBar label) {
	        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        p.add(label);
		 p.setBackground(Color.WHITE);
	        return p;
	    }

	static class SelectedImageFilter extends RGBImageFilter {
		private final float rf;
		private final float gf;
		private final float bf;

		public SelectedImageFilter(float rf, float gf, float bf) {
			super();
			this.rf = Math.min(1f, rf);
			this.gf = Math.min(1f, gf);
			this.bf = Math.min(1f, bf);
			canFilterIndexColorModel = false;
		}

		@Override
		public int filterRGB(int x, int y, int argb) {
			int r = (int) (((argb >> 16) & 0xFF) * rf);
			int g = (int) (((argb >> 8) & 0xFF) * gf);
			int b = (int) (((argb) & 0xFF) * bf);
			return (argb & 0xFF000000) | (r << 16) | (g << 8) | (b);
		}
	}

}
