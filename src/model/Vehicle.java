package model;

import enums.ParkingSpotType;

import java.util.UUID;

public class Vehicle {
    private String id;
    private String name;
    private ParkingSpotType parkingSpotType;

    public Vehicle( String name, ParkingSpotType parkingSpotType) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.parkingSpotType = parkingSpotType;
    }

    public String getId() {
        return id;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
