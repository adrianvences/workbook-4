package com.pluralsight.hotel.operations;

public class Reservation {
    // class fields
    private String roomType;
    private  int numberOfNights;
    private boolean isWeekend;

    // sets static final prices for rooms
    private static final double kingRoomPrice = 139.00;
    private static final double doubleRoomPrice = 124.00;
    private static final double weekendSurcharge = 0.10;

    // constructor for reservation
    public Reservation(boolean isWeekend, int numberOfNights, String roomType) {
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        this.roomType = roomType;
    }

    // getters and setters
    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        if ("king".equalsIgnoreCase(roomType)){
            return kingRoomPrice;
        } else if ("double".equalsIgnoreCase(roomType)) {
            return doubleRoomPrice;
        } else {
            return 0;
        }

    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }


    public double getReservationTotal() {
        double pricePerNight = getPrice();
        double total = pricePerNight * numberOfNights;

        if(isWeekend) {
            total += total * weekendSurcharge;
        }

        return total;
    }
}
