package com.jerry.listtutorial;

import android.graphics.drawable.Drawable;

/**
 * Created by jerry on 15/11/14.
 */
public class ListItem {

    //Variable
    private String header = null;
    private String subHeader = null;
    private Drawable imageUser = null;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }


    public String getSubHeader() {
        return subHeader;
    }

    public void setSubHeader(String subHeader) {
        this.subHeader = subHeader;
    }

    public Drawable getImageUser() {
        return imageUser;
    }

    public void setImageUser(Drawable imageUser) {
        this.imageUser = imageUser;
    }



}
