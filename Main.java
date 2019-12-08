package com.company;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        SiteShopBuilder shopBuilder = new SiteShopBuilder();
        SitePortfolioBuilder portfolioBuilder = new SitePortfolioBuilder();
        SiteNewsBuilder newsBuilder = new SiteNewsBuilder();

        director.builderSiteShop(shopBuilder);
        director.builderSitePortfolio(portfolioBuilder);
        director.builderSiteNews(newsBuilder);

        SiteShop shop1 = shopBuilder.getResult();
        SitePortfolio portfolio1 = portfolioBuilder.getResult();
        SiteNews news1 = newsBuilder.getResult();

        System.out.println("Type: " + shop1.getSiteType());
        System.out.println("Domen: " + shop1.getDomen());
        System.out.println("Ip: " + shop1.getIP());
        System.out.println("Title: " + shop1.getHeader().getTitle());
        System.out.println("Section Text: " + shop1.getSection().getText());
        System.out.println("Footer: " + shop1.getFooter().getText());
        System.out.println();

        System.out.println("Type: " + portfolio1.getSiteType());
        System.out.println("Domen: " + portfolio1.getDomen());
        System.out.println("Ip: " + portfolio1.getIP());
        System.out.println("Title: " + portfolio1.getHeader().getTitle());
        System.out.println("Section Text: " + portfolio1.getSection().getText());
        System.out.println("Footer: " + portfolio1.getFooter().getText());
        System.out.println();

        System.out.println("Type: " + news1.getSiteType());
        System.out.println("Domen: " + news1.getDomen());
        System.out.println("Ip: " + news1.getIP());
        System.out.println("Title: " + news1.getHeader().getTitle());
        System.out.println("Section Text: " + news1.getSection().getText());
        System.out.println("Footer: " + news1.getFooter().getText());
        System.out.println();
    }
}
