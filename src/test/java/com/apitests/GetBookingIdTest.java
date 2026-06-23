package com.apitests;

import com.model.BookingIdDTO;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static com.specification.SpecBooks.requestSpecificationBooks;

public class GetBookingIdTest {

 @Test
    public void getBookingId(){
     BookingIdDTO bookingIdDTO= RestAssured.given()
             .spec(requestSpecificationBooks())
             .get("/booking/1")
             .then()
             .statusCode(HttpStatus.SC_OK)
             .extract()
             .response()
             .as(new TypeRef<BookingIdDTO>() {
             });
     System.out.println(bookingIdDTO);
 }
}
