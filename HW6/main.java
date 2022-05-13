package HW6;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class main {
    public static void main(String[] args) throws IOException {

        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response1 = given()
                .when()
                .get("forecasts/v1/daily/5day/294021?apikey=vRxDpihsr4ScvRQyu49APzfFlOD6B3gE&q");


        System.out.println(response1.asPrettyString());


    }
}
