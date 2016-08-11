package com.thbs.materialdesign.widgets;

import javax.swing.*;
import java.awt.*;

/**
 * Created by divya_ravikumar on 09-06-2016.
 */
/*
 class used in MaterialDesignWidgetSpecsDialog-editingFrameForEditText method
 */
public class MDEditText {
    private static final int DEFAULT_WIDTH = 88;
    private static final int DEFAULT_HEIGHT = 36;
    private static final String DEFAULT_TEXT = "";

    /**
     * method will be used to create default TextField with empty string.
     * Returns the created TextField
     * @return mdEditText
     */
    public static JTextField defaultMDEditText(){
        JTextField mdEditText = new JTextField(DEFAULT_TEXT);
        styleMdEditText(mdEditText);
        return mdEditText;
    }

    /**
     * method used to set dimension for mdEditText, font size and background color
     * @param mdEditText
     */
    public static void styleMdEditText(JTextField mdEditText){
        mdEditText.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        mdEditText.setFont(mdEditText.getFont().deriveFont(Font.BOLD));
        mdEditText.setBackground(Color.WHITE);

    }

}
