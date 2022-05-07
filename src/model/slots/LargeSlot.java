package model.slots;

import enums.ParkingSpotType;

public class LargeSlot extends Slot {
    public LargeSlot(String number) {
        super(number, ParkingSpotType.LARGE);
    }
}
