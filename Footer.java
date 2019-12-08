package com.company;

public class Footer {
    private int width;
    private int height;
    private String text;

    Footer(int width, int height){
        this.width = width;
        this.height = height;
        this.text = " Все права защищены Copyright © 2019";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }
}
