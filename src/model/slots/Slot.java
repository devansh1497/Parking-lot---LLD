package model.slots;

import enums.ParkingSpotType;
import model.Vehicle;

public class Slot {

    private String number;
    private Vehicle vehicle;
    private ParkingSpotType parkingSpotType;

    public Slot(String number, ParkingSpotType parkingSpotType) {
        this.number = number;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = null;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void unParkVehicle() {
        this.vehicle = null;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public boolean isFree() {
        return vehicle == null;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "number='" + number + '\'' +
                ", parkingSpotType=" + parkingSpotType +
                '}';
    }
}
