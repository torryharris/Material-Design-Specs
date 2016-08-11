package com.thbs.materialdesign.utils;

import java.util.ArrayList;

/**
 * Created by divya_ravikumar on 23-05-2016.
 */

/**
 * This interface gives string data of button specification.
 */
public interface Strings {

    String Button = "<Button\n" +
            "   android:id=\"@+id/button\"\n" +
            "   android:layout_width=\"wrap_content\"\n" +
            "   android:layout_height=\"36dp\"\n" +
            "   android:text=\"Button\"\n" +
            "   android:paddingRight=\"16dp\"\n" +
            "   android:paddingLeft=\"16dp\"\n" +
            "   android:fontFamily=\"14pt\"\n" +
            "   android:elevation=\"2dp\">\n" +
            "</Button>";

    String TextView= "<TextView\n"+
            "   android:id=\"@+id/textview\"\n"+
            "   android:layout_width=\"wrap_content\"\n" +
            "   android:layout_height=\"48dp\"\n" +
            "   android:text=\"New Text\"\n" +
            "   android:paddingTop=\"16dp\"\n" +
            "   android:paddingButtom=\"16dp\">\n" +
            "</TextView>";

    String RATING_BAR = " <RatingBar\n" +
            "        android:id=\"@+id/ratingBar\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:rating=\"3\"/>";

    String RADIO_BUTTON = "<RadioButton\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:checked=\"true\"\n" +
            "        android:text=\"Radio Button\"/>";

    String EditText= "<EditText\n"+
            "   android:id=\"@+id/editText\"\n" +
            "   android:layout_width=\"wrap_content\"\n" +
            "   android:layout_height=\"48dp\"\n" +
            "   android:paddingTop=\"16dp\"\n"+
            "   android:paddingBottom=\"16dp\">\n" +
            "</EditText>";

    String ImageView="<ImageView\n"+
            "   android:id=\"@+id/imageView\"\n"+
            "   android:layout_width=\"56dp\"\n"+
            "   android:layout_height=\"56dp\">\n"+
            "</ImageView>";

    /**
     * Below code describes the auto suggestion data with respect to widgets
     */
    ArrayList<String> buttonAttr = new ArrayList<String>(){{
        add("android:clickable=\"true\"\n");
        add("android:clickable=\"false\"\n");
        add("android:layout_MarginTop=\" \"\n");
        add("android:layout_MarginBottom=\" \"\n");
        add("android:layout_MarginLeft=\" \"\n");
        add("android:layout_MarginRight=\" \"\n");
        add("android:layout_above=\"@+id\"\n");
        add("android:layout_below=\"@+id\"\n");
        add("android:background=\"@android:color/\"\n");
        add("android:background=\"\"\n");
        add("android:background=\"@color/\"\n");
        add("android:textColor=\"@android:color/\"\n");
        add("android:textColor=\"@color/\"\n");
        add("android:gravity=\"center\"\n");
        add("android:gravity=\"bottom\"\n");
        add("android:gravity=\"center_horizontal\"\n");
        add("android:gravity=\"center_vertical\"\n");
        add("android:visibility=\"gone\"\n");
        add("android:visibility=\"invisible\"\n");
        add("android:visibility=\"visible\"\n");

    }};

    ArrayList<String> textViewAttr=new ArrayList<String>(){
        {
            add("android:layout_MarginTop=\" \"\n");
            add("android:layout_MarginBottom=\" \"\n");
            add("android:layout_MarginLeft=\" \"\n");
            add("android:layout_MarginRight=\" \"\n");
            add("android:layout_above=\"@+id\"\n");
            add("android:layout_below=\"@+id\"\n");
            add("android:background=\"@android:color/\"\n");
            add("android:background=\"@color/\"\n");
            add("android:textColor=\"@android:color/\"\n");
            add("android:textColor=\"@color/\"\n");
            add("android:gravity=\"center\"\n");
            add("android:gravity=\"bottom\"\n");
            add("android:gravity=\"center_horizontal\"\n");
            add("android:gravity=\"center_vertical\"\n");
            add("android:visibility=\"gone\"\n");
            add("android:visibility=\"invisible\"\n");
            add("android:visibility=\"visible\"\n");
        }
    };

    ArrayList<String> editTextAttr=new ArrayList<String>(){
        {
        add("android:layout_MarginTop=\" \"\n");
        add("android:layout_MarginBottom=\" \"\n");
        add("android:layout_MarginLeft=\" \"\n");
        add("android:layout_MarginRight=\" \"\n");
        add("android:layout_above=\"@+id\"\n");
        add("android:layout_below=\"@+id\"\n");
        add("android:background=\"@android:color/\"\n");
        add("android:background=\"@color/\"\n");
        add("android:textColor=\"@android:color/\"\n");
        add("android:textColor=\"@color/\"\n");
        add("android:gravity=\"center\"\n");
        add("android:gravity=\"bottom\"\n");
        add("android:gravity=\"center_horizontal\"\n");
        add("android:gravity=\"center_vertical\"\n");
        add("android:visibility=\"gone\"\n");
        add("android:visibility=\"invisible\"\n");
        add("android:visibility=\"visible\"\n");
        }
    };

    ArrayList<String> imageViewAttr=new ArrayList<String>(){
        {
            add("android:layout_MarginTop=\" \"\n");
            add("android:layout_MarginBottom=\" \"\n");
            add("android:layout_MarginLeft=\" \"\n");
            add("android:layout_MarginRight=\" \"\n");
            add("android:layout_above=\"@+id\"\n");
            add("android:layout_below=\"@+id\"\n");
            add("android:background=\"@android:color/\"\n");
            add("android:background=\"@color/\"\n");
            add("android:gravity=\"center\"\n");
            add("android:gravity=\"bottom\"\n");
            add("android:gravity=\"center_horizontal\"\n");
            add("android:gravity=\"center_vertical\"\n");
            add("android:visibility=\"gone\"\n");
            add("android:visibility=\"invisible\"\n");
            add("android:visibility=\"visible\"\n");
        }
    };

    ArrayList<String> ratingBarAttr=new ArrayList<String>(){
        {
            add("android:layout_MarginTop=\" \"\n");
            add("android:layout_MarginBottom=\" \"\n");
            add("android:layout_MarginLeft=\" \"\n");
            add("android:layout_MarginRight=\" \"\n");
            add("android:layout_above=\"@+id\"\n");
            add("android:layout_below=\"@+id\"\n");
            add("android:background=\"@android:color/\"\n");
            add("android:background=\"@color/\"\n");
            add("android:gravity=\"center\"\n");
            add("android:gravity=\"bottom\"\n");
            add("android:gravity=\"center_horizontal\"\n");
            add("android:gravity=\"center_vertical\"\n");
            add("android:visibility=\"gone\"\n");
            add("android:visibility=\"invisible\"\n");
            add("android:visibility=\"visible\"\n");
        }
    };

    ArrayList<String> radioButtonAttr=new ArrayList<String>(){
        {
            add("android:layout_MarginTop=\" \"\n");
            add("android:layout_MarginBottom=\" \"\n");
            add("android:layout_MarginLeft=\" \"\n");
            add("android:layout_MarginRight=\" \"\n");
            add("android:layout_above=\"@+id\"\n");
            add("android:layout_below=\"@+id\"\n");
            add("android:gravity=\"center\"\n");
            add("android:gravity=\"bottom\"\n");
            add("android:gravity=\"center_horizontal\"\n");
            add("android:gravity=\"center_vertical\"\n");
            add("android:visibility=\"gone\"\n");
            add("android:visibility=\"invisible\"\n");
            add("android:visibility=\"visible\"\n");

        }
    };

}
