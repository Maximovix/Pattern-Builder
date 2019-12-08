package com.company;

public class Section {
    private SectionType type;
    private String title;
    private boolean subtext;
    private String text;
    private int numberSection;
    private int width;
    private int height;

    Section (SectionType type, String title, boolean subtext, int numberSection, int width, int height){
        this.type = type;
        this.title = title;
        this.subtext = subtext;
        this.numberSection = numberSection;
        this.width = width;
        this.height = height;
    }

    public void setText(String text){
        if (subtext) {
            this.text = text;
        }
    }

    public String getText() {
        return text;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isSubtext() {
        return subtext;
    }

    public int getNumberSection() {
        return numberSection;
    }

    public SectionType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}
