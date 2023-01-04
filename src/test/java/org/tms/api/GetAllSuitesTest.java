package org.tms.api;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.api.adapters.SuiteAdapter;

import static java.net.HttpURLConnection.HTTP_OK;

public class GetAllSuitesTest {
    @Test
    public void getAllSuitesTest(){
        String projectCode = "VCODE";
        int statusCode = new SuiteAdapter().getAllSuites(projectCode).statusCode();
        Assert.assertEquals(statusCode, HTTP_OK);
    }
}
