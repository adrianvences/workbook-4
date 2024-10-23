package com.pluralsight.hotel.operations;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @org.junit.jupiter.api.Test
    void setNumberOfNights() {
    }



    @org.junit.jupiter.api.Test
    void isWeekend() {

        Reservation res = new Reservation(false,10,"king");
        assertFalse(res.isWeekend());

    }

    @org.junit.jupiter.api.Test
    void getReservationTotal() {
        Reservation res = new Reservation(false,1,"king");
        assertEquals(139.00,res.getReservationTotal());


    }
    // check assertions
}