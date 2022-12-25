package org.tms.ui.testsAPI;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;
import static java.net.HttpURLConnection.HTTP_OK;

public class ProjectsPageTest {

    @Test
    public void getProjectsPageTest(){
        Response response = given()
                .log().all()
                .when()
                .get("https://app.qase.io/projects")
                .then()
                .log().all()
                .extract().response();
        Assert.assertEquals(response.statusCode(), HTTP_OK);
    }
}
