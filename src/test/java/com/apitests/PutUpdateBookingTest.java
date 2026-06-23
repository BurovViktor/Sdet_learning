package com.apitests;

import com.model.BookingIdDTO;
import com.model.Bookingdates;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static com.specification.SpecBooks.requestSpecificationBooks;

public class PutUpdateBookingTest {

    @Test
    public void PutUpdateBooking() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       BookingIdDTO bookingIdDTO=RestAssured.given()
                .spec(requestSpecificationBooks())
                .body(new BookingIdDTO(
                                "James",
                                "Brown",
                                111,
                                true,
                                new Bookingdates(ZonedDateTime.parse("2018-01-01",formatter), ZonedDateTime.parse("2019-01-01",formatter)),
                                "Breakfast"
                        )
                )
                .put("/booking/1")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .as(new TypeRef<BookingIdDTO>() {
                });
        System.out.println(bookingIdDTO);
    }
}
