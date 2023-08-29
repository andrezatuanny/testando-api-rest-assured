package br.ce.wcaquino;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class OlaMundo {

       @BeforeEach
       public void setup(){
              baseURI = "http://restapi.wcaquino.me";
       }

       @Test
       public void TestOlaMundo(){

              given()
                      .log().all()
              .when()
                      .get("/ola/")
              .then()
              ;
       }

       @Test
       public void devoConhecerOutrasFormasRestAssured(){

              ValidatableResponse response =
              given()
              .when()
                      .get("/ola/")
              .then()
                      .statusCode(200)
                      .body(equalTo("Ola Mundo!"))
              ;
       }

}
