package by.tms.service;

import by.tms.model.seasons.Season;
import by.tms.model.shop.Bouquet;
import by.tms.model.shop.FlowerMarket;

public class Main {

    public static void main(String[] args) {

        //Задача про сезоны
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            season.love(season);
            System.out.println(season.getTemperature());
            System.out.println(season.getDescription());
            System.out.println("------------------");
        }

        //Задача про цветы
        int totalNumber = 0;
        FlowerMarket market = new FlowerMarket();
        Bouquet[] totalBouqets = new Bouquet[]{
                market.getBouquet("ROSE", "LILY", "LILY"),
                market.getBouquet("ASTER", "HERBERA", "ROSE"),
                market.getBouquet("ROSE", "LILY", "CARNATION"),
                market.getBouquet("TULIP", "CARNATION", "LILY"),
                market.getBouquet("HERBERA", "LILY", "TULIP"),
        };
        for (Bouquet bouquet : totalBouqets) {
            System.out.println("Total cost of this bouquet is " + bouquet.cost());
            System.out.println("It consists of: " + bouquet);
            System.out.println("Total number of flowers in this bouquet: " + bouquet.getCountFlowers());
            totalNumber += bouquet.getCountFlowers();
            System.out.println("---------------------");
        }
        System.out.println("Total number of flowers in these bouquets: " + totalNumber);
    }
}
