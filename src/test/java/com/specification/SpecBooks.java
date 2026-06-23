package com.specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;

public class SpecBooks {
    public static RequestSpecification requestSpecificationBooks() {
        return new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")//---> Cтартовая URL
                .setContentType(JSON)//---> Установка Content Type
                .build();
    }
}
