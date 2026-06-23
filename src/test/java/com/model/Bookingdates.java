package com.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

public class Bookingdates {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private ZonedDateTime checkin;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private ZonedDateTime checkout;

    public Bookingdates() {

    }

    public Bookingdates(ZonedDateTime checkin, ZonedDateTime checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public ZonedDateTime getCheckin() {
        return checkin;
    }

    public ZonedDateTime getCheckout() {
        return checkout;
    }

    @Override
    public String toString() {
        return "BookingDates{" +
                "checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}

