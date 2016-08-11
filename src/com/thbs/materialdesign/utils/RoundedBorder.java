package com.thbs.materialdesign.utils;

import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by divya_ravikumar on 08-06-2016.
 */
/*
This class provides round corner for button implementation.
 */
public class RoundedBorder implements Border {
    private int radius;

    // constructor with int radius valueA
    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
    }

    /**
     * Returns whether border is opaque or not.If the border
     * is opaque, it is responsible for filling in it's own
     * background when painting.
     */
    public boolean isBorderOpaque() {
        return true;
    }

    /**
     * Paints the border for the specified component with the specified position and size.
     *
     * @param c      the component for which this border is being painted
     * @param g      the paint graphics
     * @param x      the x position of the painted border
     * @param y      the y position of the painted border
     * @param width  the width of the painted border
     * @param height the height of the painted border
     */
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
