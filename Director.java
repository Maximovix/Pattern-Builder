package com.company;

public class Director {

    public void builderSiteShop(SiteShopBuilder siteShopBuilder) {
        siteShopBuilder.setType(SiteType.SHOP);
        siteShopBuilder.setDomen("www.shopofclothes.com");
        siteShopBuilder.setIP("192.168.0.123");
        siteShopBuilder.setWidth(1200);
        siteShopBuilder.setHeader(new Header("Shop Of Clothes",900,300,true));
        siteShopBuilder.setSection(new Section(SectionType.CLIENTS, "About Us", true, 1, 1200, 1080));
        siteShopBuilder.getSection().setText("Some Text");
        siteShopBuilder.setFooter(new Footer(500,50));
    }

    public void builderSitePortfolio(SitePortfolioBuilder sitePortfolioBuilder) {
        sitePortfolioBuilder.setType(SiteType.PORTFOLIO);
        sitePortfolioBuilder.setDomen("www.portfolio.com");
        sitePortfolioBuilder.setIP("192.168.0.14");
        sitePortfolioBuilder.setWidth(1920);
        sitePortfolioBuilder.setHeader(new Header("My Portfolio",1000,200,false));
        sitePortfolioBuilder.setSection(new Section(SectionType.MAIN, "My Hobbies", true, 3, 1000, 500));
        sitePortfolioBuilder.getSection().setText("My Bobbies");
        sitePortfolioBuilder.setFooter(new Footer(1080,100));
    }

    public void builderSiteNews(SiteNewsBuilder siteNewsBuilder) {
        siteNewsBuilder.setType(SiteType.NEWS);
        siteNewsBuilder.setDomen("www.newsofworld.com");
        siteNewsBuilder.setIP("192.168.0.111");
        siteNewsBuilder.setWidth(500);
        siteNewsBuilder.setHeader(new Header("News Of World",300,300,true));
        siteNewsBuilder.setSection(new Section(SectionType.NEWS, "News", false, 1, 500, 2000));
        siteNewsBuilder.getSection().setText("Some News");
        siteNewsBuilder.setFooter(new Footer(100,40));
    }
}
