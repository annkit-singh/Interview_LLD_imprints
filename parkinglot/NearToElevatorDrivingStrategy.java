package com.explore.parkinglot;

public class NearToElevatorDrivingStrategy implements  ParkingStrategy{
    @Override
    public void displayStrategy() {
        System.out.println("Park near to elevator! ");
    }

    @Override
    public void findParking() {
        System.out.println("Park near to Elevator! ");
    }
}
