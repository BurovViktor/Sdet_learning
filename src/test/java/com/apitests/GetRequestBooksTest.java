package com.apitests;

import com.model.BookingDTO;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.specification.SpecBooks.requestSpecificationBooks;

public class GetRequestBooksTest {

    @Test
    public void getGetBookingIds() {
        List<BookingDTO> response = RestAssured.given()
                .spec(requestSpecificationBooks())
                .get("/booking")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .extract()
                .response()
             //           .asPrettyString();
                .as(new TypeRef<List<BookingDTO>>() {
               });

        System.out.println(response.get(0).bookingId);

    }

}
