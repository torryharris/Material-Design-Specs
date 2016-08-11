package com.thbs.materialdesign.widgets;

import javax.swing.*;
import java.awt.*;

/**
 * Created by divya_ravikumar on 08-06-2016.
 */
/*
 class used in MaterialDesignWidgetSpecsDialog-editingFrameForTextView method
 */
public class MDTextview {
    private static final int DEFAULT_WIDTH = 88;
    private static final int DEFAULT_HEIGHT = 36;
    private static final String DEFAULT_TEXT = "   New Text";

    /**
     * method will be used to create default JLabel with text.
     * Returns the created button
     * @return mdButton
     */
    public static JLabel defaultMDTextView(){
        JLabel jLabel = new JLabel(DEFAULT_TEXT);
        styleMDTextView(jLabel);
        return jLabel;
    }

    //take jLabel reference and setText to uppercase
    public static void changeText(JLabel jLabel, String text){
        styleMDTextView(jLabel);
        jLabel.setText(text.toUpperCase());
    }

    /**
     * method used to set dimension for jLabel, font size and background color
     * @param jLabel
     */
    public static void styleMDTextView(JLabel jLabel){
        jLabel.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        jLabel.setFont(new Font(null, Font.BOLD, 12));
        jLabel.setBackground(Color.WHITE);
        jLabel.setOpaque(true);
    }

    /*
    This method is responsible when user edit and set jLabel(textview) background color
     */
    public static void changeBgColor(JLabel jLabel, String colorHexCode){
        jLabel.setBackground(Color.decode(colorHexCode));
    }
}
