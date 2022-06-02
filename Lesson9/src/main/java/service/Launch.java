package service;

import model.spaceport.Shuttle;
import model.spaceport.SpaceX;
import model.spaceport.Spaceport;

public class Launch {
    public static void main(String[] args) {

        Spaceport spaceport1 = new Spaceport();
        Shuttle shuttle1 = new Shuttle();
        SpaceX spaceX1 = new SpaceX();

        spaceport1.start(shuttle1);
        spaceport1.start(spaceX1);
    }
}
