package com.explore.parkinglot;

import java.util.List;

class ParkingSpotManagerFactory {
    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots) {
        if (vehicleType == VehicleType.TwoWheeler)
            return new TwoWheelerSpotManager(spots);
        else if (vehicleType == VehicleType.FourWheeler)
            return new FourWheelerSpotManager(spots);
        else
            return null; // Handle error
    }
}
