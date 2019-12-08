package com.company;

public class SiteNews {
    private SiteType type;
    private String domen;
    private String ip;
    private int width;
    private Header header;
    private Section section;
    private Footer footer;

    SiteNews (SiteType type, String domen, String ip, int width, Header header, Section section, Footer footer){
        this.type = type;
        this.domen = domen;
        this.ip = ip;
        this.width = width;
        this.header = header;
        this.section = section;
        this.footer = footer;
    }

    public SiteType getSiteType(){
        return type;
    }

    public String getDomen(){
        return domen;
    }

    public String getIP(){
        return ip;
    }

    public int getWidth(){
        return width;
    }

    public Header getHeader(){
        return header;
    }

    public Section getSection(){
        return section;
    }

    public Footer getFooter(){
        return footer;
    }
}
