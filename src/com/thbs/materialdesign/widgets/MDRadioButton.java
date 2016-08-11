package com.thbs.materialdesign.widgets;

import javax.swing.*;

/**
 * Created by kumar_velu on 21-06-2016.
 */
/*
 class used in MaterialDesignWidgetSpecsDialog-editingFrameForRadioButton method
 */
public class MDRadioButton {

    private static final String DEFAULT_TEXT = "Radio Button";
    /**
     * method will be used to create default RadioButton with DEFAULT_TEXT.
     * Returns the created RadioButton
     * @return mdRadioButton
     */
    public static JRadioButton defaultMDRadioButton(){
        JRadioButton mdRadioButton = new JRadioButton(DEFAULT_TEXT, true);
        return mdRadioButton;
    }
}
