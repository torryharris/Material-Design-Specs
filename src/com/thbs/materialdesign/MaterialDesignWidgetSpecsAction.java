package com.thbs.materialdesign;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by divya_ravikumar on 19-05-2016.
 */
public class MaterialDesignWidgetSpecsAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        /**
         * @param event Action event
         */
        MaterialDesignWidgetSpecsDialog materialDesignWidgetSpecsDialog = new MaterialDesignWidgetSpecsDialog();
        materialDesignWidgetSpecsDialog.setVisible(true);
    }
}
