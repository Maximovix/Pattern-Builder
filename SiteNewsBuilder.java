package com.company;

public class SiteNewsBuilder implements BuilderSites {
    private SiteType type;
    private String domen;
    private String ip;
    private int width;
    private Header header;
    private Section section;
    private Footer footer;

    @Override
    public void setType(SiteType type) {
        this.type = type;
    }

    @Override
    public void setDomen(String domen) {
        this.domen = domen;
    }

    @Override
    public void setIP(String ip) {
        this.ip = ip;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeader(Header header) {
        this.header = header;
    }

    @Override
    public void setSection(Section section) {
        this.section = section;
    }

    @Override
    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Section getSection() {
        return section;
    }

    public SiteNews getResult(){
        return new SiteNews(type, domen, ip, width, header, section, footer);
    }
}
