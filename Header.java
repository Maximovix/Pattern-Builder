package com.company;

public class Header {
    private String title;
    private int width;
    private int height;
    private boolean navItem;

    Header (String title, int width, int height, boolean navItem){
        this.title = title;
        this.width = width;
        this.height = height;
        this.navItem = navItem;
    }

    public String getTitle(){
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isNavItem() {
        return navItem;
    }
}
