package com.explore.parkinglot;

import java.util.List;

abstract class ParkingSpotManager {
    List<ParkingSpot> spots;

    ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    abstract  void addParkingSpace();

    abstract ParkingSpot findParkingSpace();

    void parkVehicle(Vehicle v, ParkingStrategy parkingStrategy) {
        ParkingSpot spot = findParkingSpace();
        spot.parkVehicle(v);
    }

    void parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpace();
        spot.parkVehicle(v);
    }

    void removeVehicle(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (spot.vehicle != null && spot.vehicle.equals(v)) {
                spot.removeVehicle();
                break;
            }
        }
    }
}