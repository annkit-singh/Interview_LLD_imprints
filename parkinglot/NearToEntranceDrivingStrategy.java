package com.explore.parkinglot;

public class NearToEntranceDrivingStrategy implements  ParkingStrategy {

    @Override
    public void displayStrategy() {
        System.out.println("Prefer Parking near to entrance !");
    }

    @Override
    public void findParking() {
        System.out.println("Finding near to Entrance Parking !");
    }
}
