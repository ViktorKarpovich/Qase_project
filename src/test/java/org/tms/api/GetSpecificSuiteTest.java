package org.tms.api;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.api.adapters.SuiteAdapter;

import static java.net.HttpURLConnection.HTTP_OK;

public class GetSpecificSuiteTest {
    @Test
    public void getAllSuitesTest(){
        String projectCode = "VCODE";
        int id = 1;
        int statusCode = new SuiteAdapter().getSpecificSuites(projectCode, id).statusCode();
        Assert.assertEquals(statusCode, HTTP_OK);
    }
}
