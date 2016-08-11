package com.thbs.materialdesign;

import com.intellij.ui.components.JBScrollPane;
import com.thbs.materialdesign.autosuggestion_class.AutoSuggestor;
import com.thbs.materialdesign.utils.*;
import com.thbs.materialdesign.widgets.MDButton;
import com.thbs.materialdesign.widgets.MDEditText;
import com.thbs.materialdesign.widgets.MDRadioButton;
import com.thbs.materialdesign.widgets.MDTextview;

import javax.swing.*;
import javax.swing.plaf.metal.MetalButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Map;

import static com.thbs.materialdesign.widgets.MDRatingBar.DEFAULT_RATING;


/**
 * Created by divya_ravikumar on 13-07-2016.
 */
public class MaterialDesignWidgetSpecsDialog extends Component {

    private static final int MAIN_FRAME_WIDTH = 1200;
    private static final int MAIN_FRAME_HEIGHT = 618;
    private static final int PADDING = 20;

    private static final String URL_OVERVIEW = "http://www.color-hex.com/";
    private ArrayList<String> attr = new ArrayList<String>();

    private String listItem[] = com.thbs.materialdesign.utils.Widgets.widgetList;
    private String widgets[] = {Strings.Button, Strings.TextView, Strings.EditText, Strings.RATING_BAR, Strings.RADIO_BUTTON};
    //main material design widgets specs frame with main panel and pluginTitle
    private JFrame mainFrame;
    JPanel mainPanel;
    JLabel pluginTitle;

    private JButton btWidget;
    private JScrollPane scrollPane;
    private JTextArea widgetAttribute;
    private JPanel overViewImage;
    private JLabel hexaCodeLink;
    private JButton save;
    private JButton dragDropBt;
    private String widgetAttributes;

    private JButton mDbutton;
    private JLabel mDTextView;
    private JPanel ratingBar;
    private JRadioButton radioButton;
    private JTextField mDEditText;
    private JButton selectedBtn = null;

    private Color antiFlashWhite = new Color(243, 243, 243);
    private Color green = new Color(34, 201, 114);
    private Color white = new Color(255, 255, 255);

    public MaterialDesignWidgetSpecsDialog() {

        mainFrame = new JFrame();
        mainFrame.setSize(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);

        mainPanel = new JPanel();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.PAGE_START;
        constraints.insets = new Insets(0, 0, 40, 0);

        pluginTitle = new JLabel();
        pluginTitle.setVerticalAlignment(JLabel.TOP);
        pluginTitle.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        pluginTitle.setText("   Material MaterialDesignWidgetSpecsAction Guidelines                                                                                        ");
        pluginTitle.setForeground(white);
        pluginTitle.setBackground(green);
        pluginTitle.setOpaque(true);
        pluginTitle.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 34));

        constraints.gridy = 1;

        mainPanel.setBackground(antiFlashWhite);
        mainPanel.add(pluginTitle, constraints);
        mainPanel.add(new ContentPanel(), constraints);
        mainFrame.add(mainPanel);

    }

    // on top of main panel contentpanel will be displayed
    private class ContentPanel extends Panel {
        public ContentPanel() {
            /*
            In content panel screen is divided into two equal parts i.e,leftpanel and rightpanel.
             */
            setLayout(new GridLayout(1, 2));
            add(LeftPanel());
            add(RightPanel());
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.lightGray);
            g.fillRect(520, 0, 2, 730);
        }
    }

    /*
    Right panel:contains widget specification, widget overview and functionality buttons.
     */
    private JPanel RightPanel() {
        //Inside content panel right portion is covered by rightPanel.
        JPanel rightPanel = new JPanel(new GridLayout(2, 1));
        rightPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(30, 20, 60, 0), BorderFactory.createLineBorder(Color.lightGray, 2, true)));
        JPanel topJPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, PADDING, PADDING));

        //adding TextArea with widget specification to topJPanel via scrollPane
        widgetAttribute = new JTextArea();
        widgetAttribute.setVisible(false);
        widgetAttribute.setEditable(true);
        scrollPane = new JBScrollPane(widgetAttribute);
        scrollPane.setVisible(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        scrollPane.setBackground(antiFlashWhite);
        topJPanel.add(scrollPane);

        //adding widget overview JPanel to topJPanel
        overViewImage = new JPanel();
        overViewImage.setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 0));
        overViewImage.setBackground(antiFlashWhite);
        topJPanel.add(overViewImage);
        //add topJPanel to rightPanel which is right portion of main panel
        rightPanel.add(topJPanel);

        JPanel bottomJPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, PADDING, PADDING));
        bottomJPanel.setBorder(BorderFactory.createEmptyBorder(120, 0, 0, 0));

        //adding hexaCodeLink JLabel to topJPanel
        hexaCodeLink = new JLabel("Color Hexa Code");
        hexaCodeLink.setFont(new Font(null, Font.BOLD, 14));
        hexaCodeLink.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 30));
        Font font1 = hexaCodeLink.getFont();
        Map attributes = font1.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        hexaCodeLink.setFont(font1.deriveFont(attributes));
        initLabelLink(hexaCodeLink, URL_OVERVIEW);
        bottomJPanel.add(hexaCodeLink);

        //adding save JButton to topJPanel
        save = new JButton("Save");
        save.setPreferredSize(new Dimension(140, 50));
        save.setFont(new Font(null, Font.BOLD, 14));
        save.setUI(new MetalButtonUI());
        save.setBorderPainted(false);
        save.setBackground(green);
        save.setForeground(white);
        bottomJPanel.add(save);

        //adding dragDropBt JButton to topJPanel
        dragDropBt = new JButton("Drag and Drop");
        dragDropBt.setPreferredSize(new Dimension(140, 50));
        dragDropBt.setUI(new MetalButtonUI());
        dragDropBt.setFont(new Font(null, Font.BOLD, 14));
        dragDropBt.setBackground(green);
        dragDropBt.setForeground(white);
        dragDropBt.setBorderPainted(false);
        dragDropBt.setVisible(true);
        bottomJPanel.add(dragDropBt);

        topJPanel.setBackground(antiFlashWhite);
        bottomJPanel.setBackground(antiFlashWhite);
        //add bottomJPanel to rightPanel which is right portion of main panel
        rightPanel.add(bottomJPanel);
        rightPanel.setBackground(antiFlashWhite);
        return rightPanel;
    }


    public JPanel LeftPanel() {
        //Inside content panel left portion is covered by LeftPanel.
        final JPanel leftMainPanel = new JPanel(new GridBagLayout());
        final GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(10, 10, 5, 80);
        gbc.anchor = GridBagConstraints.NORTH;

        //for loop iterates and displays string array of widgets
        for (int index = 0; index < listItem.length; index++) {
            Font font = new Font("Serif", Font.BOLD, 15);
            //btWidget displays button according to the index
            btWidget = new JButton(listItem[index]);
            btWidget.setOpaque(true);
            btWidget.setBorder(new RoundedBorder(10));
            btWidget.setBackground(Color.WHITE);
            btWidget.setRolloverEnabled(true);
            btWidget.setFont(font);

            final int finalIndex = index;
            //add addMouseListener:when user clicks on button perform corresponding operation
            btWidget.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent e) {

                    clearPreviousSelectedBtn(selectedBtn);
                    selectedBtn = (JButton) e.getSource();
                    selectedBtn.setForeground(Color.GREEN.darker());

                    // onClick with respect to button displays widget specification
                    widgetAttribute.setText(widgets[finalIndex]);
                    widgetAttribute.setFont(new Font("Serif", Font.PLAIN + Font.BOLD, 15));
                    widgetAttribute.setVisible(true);
                    scrollPane.setVisible(true);
                    scrollPane.setPreferredSize(new Dimension(350, 180));

                    switch (listItem[finalIndex]) {
                        case com.thbs.materialdesign.utils.Widgets.BUTTON:
                            attr = Strings.buttonAttr;
                            break;

                        case com.thbs.materialdesign.utils.Widgets.TEXT_VIEW:
                            attr = Strings.textViewAttr;
                            break;

                        case com.thbs.materialdesign.utils.Widgets.EDIT_TEXT:
                            attr = Strings.editTextAttr;
                            break;

                        case com.thbs.materialdesign.utils.Widgets.RATING_BAR:
                            attr = Strings.ratingBarAttr;
                            break;

                        case com.thbs.materialdesign.utils.Widgets.RADIO_BUTTON:
                            attr = Strings.radioButtonAttr;
                            break;

                        default:
                            break;
                    }

                    //when user starts to edit,autosuggestor displays default dictionary suggestion
                    AutoSuggestor autoSuggestor = new AutoSuggestor(widgetAttribute, attr, Color.BLUE, Color.RED) {
                        @Override
                        public boolean wordTyped(String typedWord) {
                            return super.wordTyped(typedWord);//now call super to check for any matches against newest dictionary
                        }
                    };
                    autoSuggestor.setDictionary(attr);

                    //displaying images for widgets onClick
                    overViewImage.removeAll();
                    switch (listItem[finalIndex]) {

                        case com.thbs.materialdesign.utils.Widgets.BUTTON:
                            overViewImage.add(editingFrameForButton());
                            break;

                        case com.thbs.materialdesign.utils.Widgets.TEXT_VIEW:
                            overViewImage.add(editingFrameForTextView());
                            break;

                        case com.thbs.materialdesign.utils.Widgets.EDIT_TEXT:
                            overViewImage.add(editingFrameForEditText());
                            break;

                        case com.thbs.materialdesign.utils.Widgets.RATING_BAR:
                            overViewImage.add(editingFrameForRatingBar(DEFAULT_RATING));
                            break;

                        case com.thbs.materialdesign.utils.Widgets.RADIO_BUTTON:
                            overViewImage.add(editingFrameForRadioButton());
                            break;

                        default:
                            break;
                    }
                    overViewImage.revalidate();
                    overViewImage.repaint();

                    //After editing the widget specification, click on save button will save the
                    // current changes and user can drag and drop same.
                    save.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            widgetAttributes = widgetAttribute.getText();
                            dragDropBt.setTransferHandler(new ValueExportTransferHandler(widgetAttributes));

                            //editing text of the widget
                            String[] textArr = widgetAttributes.split("android:text=\"", 2);
                            String[] resText = null;
                            if (textArr.length >= 2)
                                resText = textArr[1].split("\"");
                            if (resText != null && resText.length > 1) {

                                switch (listItem[finalIndex]) {
                                    case com.thbs.materialdesign.utils.Widgets.BUTTON:
                                        MDButton.changeText(mDbutton, resText[0]);
                                        break;

                                    case com.thbs.materialdesign.utils.Widgets.TEXT_VIEW:
                                        MDTextview.changeText(mDTextView, resText[0]);
                                        break;

                                    default:
                                        break;
                                }
                            }
                            //editing background color of the widget
                            String[] bgColorArr = widgetAttributes.split("android:background=\"", 2);
                            String[] resBgColor = null;

                            if (bgColorArr.length >= 2)
                                resBgColor = bgColorArr[1].split("\"");

                            if (resBgColor != null && resBgColor.length > 1) {

                                switch (listItem[finalIndex]) {
                                    case com.thbs.materialdesign.utils.Widgets.BUTTON:
                                        MDButton.changeBgColor(mDbutton, resBgColor[0]);
                                        break;

                                    case com.thbs.materialdesign.utils.Widgets.TEXT_VIEW:
                                        MDTextview.changeBgColor(mDTextView, resBgColor[0]);
                                        break;

                                    default:
                                        break;
                                }
                            }

                        }
                    });

                    //when user drag and drop,widgets specification will be copied to their working screen
                    dragDropBt.setTransferHandler(new com.thbs.materialdesign.utils.ValueExportTransferHandler(widgets[finalIndex]));
                    dragDropBt.addMouseMotionListener(new MouseAdapter() {
                        @Override
                        public void mouseDragged(MouseEvent e) {

                            JButton button = (JButton) e.getSource();
                            TransferHandler handle = button.getTransferHandler();
                            handle.exportAsDrag(button, e, TransferHandler.COPY);
                        }
                    });

                }
            });

            btWidget.setBackground(antiFlashWhite);
            btWidget.revalidate();
            btWidget.repaint();

            leftMainPanel.add(btWidget, gbc);
            leftMainPanel.setBackground(antiFlashWhite);

        }
        return leftMainPanel;
    }

    //editingFrameForButton:displays overview button widget
    public JPanel editingFrameForButton() {
        JPanel btOverviewPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        mDbutton = MDButton.defaultMDButton();
        btOverviewPanel.add(mDbutton, gbc);
        btOverviewPanel.setBackground(antiFlashWhite);
        return btOverviewPanel;
    }

    //editingFrameForTextView displays overview textview widget
    public JPanel editingFrameForTextView() {
        JPanel tvOverviewPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        mDTextView = MDTextview.defaultMDTextView();
        tvOverviewPanel.add(mDTextView, gbc);
        tvOverviewPanel.setBackground(antiFlashWhite);
        return tvOverviewPanel;
    }

    //editingFrameForRatingBar displays overview rating bar widget
    public JPanel editingFrameForRatingBar(int rating) {
        JPanel ratingOverviewPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        ratingBar = new RatingBar(rating);
        ratingOverviewPanel.add(ratingBar, gbc);
        ratingOverviewPanel.setBackground(antiFlashWhite);
        ratingBar.setBackground(antiFlashWhite);
        return ratingOverviewPanel;
    }

    //editingFrameForRadioButton displays overview radion button widget
    public JPanel editingFrameForRadioButton() {
        JPanel radioBtOverviewPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        radioButton = MDRadioButton.defaultMDRadioButton();
        radioBtOverviewPanel.add(radioButton, gbc);
        radioBtOverviewPanel.setBackground(antiFlashWhite);
        radioButton.setBackground(antiFlashWhite);
        return radioBtOverviewPanel;
    }

    //editingFrameForEditText displays overview edittext button widget
    public Component editingFrameForEditText() {
        JPanel etOverviewPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        mDEditText = MDEditText.defaultMDEditText();
        mDEditText.getCaret().setVisible(true);
        etOverviewPanel.add(mDEditText, gbc);
        etOverviewPanel.setBackground(antiFlashWhite);
        return etOverviewPanel;
    }

    //Below code describe:click on hexaCodeLink opens webpage where user
    // can choose hexacode for background
    private void initLabelLink(JLabel labelOverview, final String urlOverview) {
        labelOverview.setForeground(green);
        labelOverview.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        labelOverview.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                if (event.getClickCount() > 0) {
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        try {
                            URI uri = new URI(urlOverview);
                            desktop.browse(uri);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }


    public static void main(String[] args) {
        new MaterialDesignWidgetSpecsDialog();
    }

    //click btWidget will remove the previous selected state and displays only current state
    public void clearPreviousSelectedBtn(JButton jButton) {

        if (null != jButton) {
            jButton.setOpaque(true);
            jButton.setForeground(Color.BLACK);
        }

    }

}
