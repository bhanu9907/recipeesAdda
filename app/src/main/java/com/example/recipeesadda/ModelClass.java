package com.example.recipeesadda;

import android.graphics.drawable.Drawable;

public class ModelClass {
    Drawable image;
    String textview1,textview2;

    public ModelClass(Drawable image, String textview1, String textview2) {
        this.image = image;
        this.textview1 = textview1;
        this.textview2 = textview2;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTextview1() {
        return textview1;
    }

    public void setTextview1(String textview1) {
        this.textview1 = textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public void setTextview2(String textview2) {
        this.textview2 = textview2;
    }
}
