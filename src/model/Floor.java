package model;

import model.slots.Slot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private String number;
    private List<Slot> slots;

    public Floor(String number) {
        this.number = number;
        this.slots = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void addSlot(Slot slot) {
        this.slots.add(slot);
    }
}
