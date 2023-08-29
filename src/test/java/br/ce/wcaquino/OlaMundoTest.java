package br.ce.wcaquino;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class OlaMundoTest {

    @Test
    public void testOlaMundo(){

        ValidatableResponse response =
                given() //Pré condições
                .when() //Ações
                        .get("/ola/")
                .then() //Assertivas
                        .statusCode(200)
                        .body(equalTo("Ola Mundo!"))
                ;
    }
}
