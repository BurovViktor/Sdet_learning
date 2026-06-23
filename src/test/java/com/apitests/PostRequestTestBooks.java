package com.apitests;

import com.model.BookDTO;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static com.specification.SpecBooks.requestSpecificationBooks;

public class PostRequestTestBooks {
    @Test
    public void postRequestBooks() {
        Response response = RestAssured.given()
                .spec(requestSpecificationBooks())
                .body(new BookDTO("admin", "password123"))
                .post("/auth")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .extract()
                .response();

        System.out.println(response.body().prettyPrint());
    }

}
