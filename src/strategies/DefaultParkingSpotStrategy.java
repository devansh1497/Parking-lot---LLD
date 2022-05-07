package strategies;

import ParkingLot.ParkingLot;
import model.Floor;
import model.Vehicle;
import model.slots.Slot;

import java.util.List;

public class DefaultParkingSpotStrategy implements ParkingSpotStrategy {

    private final ParkingLot parkingLot;

    public DefaultParkingSpotStrategy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public Slot getSlot(Vehicle vehicle) {
        List<Floor> floors = parkingLot.getFloors();
        for (Floor floor : floors) {
            for (Slot slot : floor.getSlots()) {
                if(slot.isFree() && slot.getParkingSpotType() == vehicle.getParkingSpotType()) {
                    return slot;
                }
            }
        }
        return null;
    }
}
