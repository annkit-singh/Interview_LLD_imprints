package com.explore.parkinglot;

import java.util.List;

public class TwoWheelerSpotManager extends  ParkingSpotManager{

    List<ParkingSpot> list;
    TwoWheelerSpotManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    void addParkingSpace() {

    }

    @Override
    ParkingSpot findParkingSpace() {
        return null;
    }
}
