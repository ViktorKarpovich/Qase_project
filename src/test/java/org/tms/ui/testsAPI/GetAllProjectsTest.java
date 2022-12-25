package org.tms.ui.testsAPI;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllProjectsTest {

    @Test
    public void getAllProjectsTest(){
        given()
                .when()
                .get("https://api.qase.io/v1/project")
                .then()
                .statusCode(401);
    }

}
