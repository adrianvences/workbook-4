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

    public void setRoom(int room) {
        this.room = room;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkIn() {
        this.occupied = true;
        this.isDirty = true;
    }

    public void checkOut () {
        cleanRoom();
    }

    public void cleanRoom() {
        this.isDirty = false;
        this.occupied = false;
    }


}
