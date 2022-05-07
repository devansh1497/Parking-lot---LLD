package model.slots;

import enums.ParkingSpotType;

public class CompactSlot extends Slot {
    public CompactSlot(String number) {
        super(number, ParkingSpotType.COMPACT);
    }
}
