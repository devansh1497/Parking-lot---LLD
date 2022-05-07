package strategies;

import model.Vehicle;
import model.slots.Slot;

public interface ParkingSpotStrategy {

    Slot getSlot(Vehicle vehicle);
}
