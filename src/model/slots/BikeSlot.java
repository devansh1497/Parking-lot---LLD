package model.slots;

import enums.ParkingSpotType;

public class BikeSlot extends Slot {
    public BikeSlot(String number) {
        super(number, ParkingSpotType.BIKE);
    }
}
