package com.thbs.materialdesign.utils;

import javax.swing.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;

/**
 * Created by divya_ravikumar on 08-06-2016.
 */

/**
 * This class is used to handle the transferable.
 * used to represent a drag from a component, and a drop to a component.
 */
public class ValueExportTransferHandler extends TransferHandler {

    public static final DataFlavor SUPPORTED_DATE_FLAVOR = DataFlavor.stringFlavor;
    private String value;

    public ValueExportTransferHandler(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // Returns the Drag & Drop actions supported by the component provided when acting as drag source.
    @Override
    public int getSourceActions(JComponent c) {
        return DnDConstants.ACTION_COPY_OR_MOVE;
    }

    //Creates a Transferable that can be used to export data from the specified component.
    @Override
    protected Transferable createTransferable(JComponent c) {
        Transferable t = new StringSelection(getValue());
        return t;
    }

    // Called by the Drag & Drop system to complete the export of transferable data from the drag source component.
    @Override
    protected void exportDone(JComponent source, Transferable data, int action) {
        super.exportDone(source, data, action);
    }
}
