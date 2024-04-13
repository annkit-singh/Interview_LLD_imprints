package com.explore.parkinglot;

import java.util.List;

class EntranceGate {
    ParkingSpotManagerFactory factory;

    EntranceGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots) {
        ParkingSpotManager manager = factory.getParkingSpotManager(vehicleType, spots);

        return manager.findParkingSpace();
    }



    public void updateParkingSpace() {

    }
    Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        // Implementation to generate ticket
        return null;
    }
}