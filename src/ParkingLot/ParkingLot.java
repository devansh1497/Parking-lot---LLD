package ParkingLot;

import model.Floor;
import model.Vehicle;
import model.slots.Slot;
import strategies.DefaultParkingSpotStrategy;
import strategies.ParkingSpotStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private final List<Floor> floors = new ArrayList<>();
    private static ParkingSpotStrategy parkingSpotStrategy;
    private final Map<Vehicle, Slot> vehicleSlotMap = new HashMap<>();

    private static ParkingLot INSTANCE = null;

    private ParkingLot() {}

    public static ParkingLot getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ParkingLot();
            parkingSpotStrategy = new DefaultParkingSpotStrategy(INSTANCE);
        }
        return INSTANCE;
    }


    public Floor addFloor(String floorName) {
        Floor floor = new Floor(floorName);
        this.floors.add(floor);
        return floor;
    }

    public List<Floor> getFloors() {
        return this.floors;
    }

    public void park(Vehicle vehicle) {
        Slot slot = parkingSpotStrategy.getSlot(vehicle);
        if(slot == null) {
            System.out.println("Couldn't find a matching parking spot");
            return;
        }
        slot.parkVehicle(vehicle);
        vehicleSlotMap.put(vehicle, slot);
        System.out.println("Vehicle "+vehicle+" parked in slot: "+slot);
    }

    public void unPark(Vehicle vehicle) {
        Slot slot = vehicleSlotMap.get(vehicle);
        slot.unParkVehicle();
        System.out.println("Slot "+slot+" is vacant now.");
    }
}
