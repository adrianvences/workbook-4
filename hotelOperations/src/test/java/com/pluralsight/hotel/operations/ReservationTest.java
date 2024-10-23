package com.pluralsight.hotel.operations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ReservationTest {

    @org.junit.jupiter.api.Test
    void setNumberOfNights() {
    }



    @org.junit.jupiter.api.Test
    void isWeekend() {

        Reservation res = new Reservation(false,10,"king");
        assertTrue(res.isWeekend());

    }

    @org.junit.jupiter.api.Test
    void getReservationTotal() {
    }
}