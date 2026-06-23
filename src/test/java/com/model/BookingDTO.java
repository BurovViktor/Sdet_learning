package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookingDTO {
    @JsonProperty("bookingid")
    public Integer bookingId;
}
