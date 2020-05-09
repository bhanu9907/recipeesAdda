package com.example.recipeesadda;

import android.graphics.drawable.Drawable;
import android.widget.RatingBar;
import android.widget.TextView;

public class ModelClass2 {
    Drawable img;
    String txt1,txt2,txt3;
    Float rt;

    public ModelClass2(Drawable img, String txt1, String txt2, String txt3, Float rt) {
        this.img = img;
        this.txt1 = txt1;
        this.txt2 = txt2;
        this.txt3 = txt3;
        this.rt = rt;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }

    public Float getRt() {
        return rt;
    }

    public void setRt(Float rt) {
        this.rt = rt;
    }
}
