import ParkingLot.ParkingLot;
import enums.ParkingSpotType;
import model.Floor;
import model.Vehicle;
import model.slots.Slot;
import strategies.DefaultParkingSpotStrategy;

public class MainApp {


    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        Floor floor1 = parkingLot.addFloor("floor1");
        Floor floor2 = parkingLot.addFloor("floor2");
        Slot slot1 = new Slot("slot1", ParkingSpotType.COMPACT);
        Slot slot2 = new Slot("slot2", ParkingSpotType.BIKE);
        floor1.addSlot(slot1);
        floor2.addSlot(slot2);

        Vehicle vehicle1 = new Vehicle("veh1", ParkingSpotType.BIKE);
        parkingLot.park(vehicle1);
        parkingLot.unPark(vehicle1);
        Vehicle vehicle2 = new Vehicle("veh2", ParkingSpotType.BIKE);
        parkingLot.park(vehicle2);
    }
}
