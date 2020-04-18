package com.example.ca_whatsapp;

import android.view.View;

public class chat_home {
    private String Name;
    private String Time;
    private String Desc;
    private int ImageView;

    public chat_home(String name, String time, String desc, int imageView) {
        Name = name;
        Time = time;
        Desc = desc;
        ImageView = imageView;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }
}
