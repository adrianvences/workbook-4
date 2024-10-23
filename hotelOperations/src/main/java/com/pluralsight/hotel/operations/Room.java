package com.pluralsight.hotel.operations;

public class Room {
    // room class fields
    private int room;
    private double price;
    private boolean occupied;
    private boolean isDirty;
    private boolean isAvailable;


    // room constructor
    public Room(int room, double price, boolean occupied, boolean isDirty, boolean isAvailable) {
        this.room = room;
        this.price = price;
        this.occupied = occupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    // getters and setters
    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
