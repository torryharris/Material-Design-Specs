package com.thbs.materialdesign.widgets;

import com.thbs.materialdesign.utils.RoundedBorder;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kumar_velu on 06-06-2016.
 */
/*
 class used in MaterialDesignWidgetSpecsDialog-editingFrameForButton method
 */
public class MDButton {

    private static final int DEFAULT_WIDTH = 88;
    private static final int DEFAULT_HEIGHT = 36;
    private static final String DEFAULT_TEXT = "BUTTON";

    /**
     * method will be used to create default button with text,border.
     * Returns the created button
     * @return mdButton
     */
    public static JButton defaultMDButton() {
        JButton mdButton = new JButton(DEFAULT_TEXT);
        mdButton.setBorder(new RoundedBorder(10));
        styleMdButton(mdButton);
        return mdButton;
    }

    //take button reference and setText to uppercase
    public static void changeText(JButton jButton, String text) {
        styleMdButton(jButton);
        jButton.setText(text.toUpperCase());
    }

    /**
     * method used to set dimension for button, font size and background color
     * @param jButton
     */
    public static void styleMdButton(JButton jButton) {
        jButton.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        jButton.setFont(jButton.getFont().deriveFont(Font.BOLD));
        jButton.setBackground(Color.LIGHT_GRAY);
    }

    /*
    This method is responsible when user edit and set button background color
     */
    public static void changeBgColor(JButton jButton, String colorHexCode) {
        jButton.setBackground(Color.decode(colorHexCode));
    }
}
