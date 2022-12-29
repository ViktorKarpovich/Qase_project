package org.tms.api.adapters;

import com.google.gson.Gson;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.tms.api.utils.Constants.*;

public class BaseAdapter {
    protected Gson converter = new Gson();

    protected Response get(String url){
        return given()
                .header(API_TOKEN_NAME, API_KEY)
                .when()
                .get(API_URL + url)
                .then()
                .log().all()
                .extract().response();
    }

    protected Response post(String url, String body){
        return given()
                .header(API_TOKEN_NAME, API_KEY)
                .header(CONTENT_TYPE, JSON)
                .body(body)
                .when()
                .post(API_URL + url)
                .then()
                .log().all()
                .extract().response();
   }

}
