package org.tms.ui.testsAPI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.api.adapters.SuiteAdapter;

import static java.net.HttpURLConnection.HTTP_OK;

public class GetSpecificSuiteTest {
    private String projectCode = "VCODE";
    private int id = 1;
    @Test
    public void getAllSuitesTest(){
        int statusCode = new SuiteAdapter().getSpecificSuites(projectCode, id).statusCode();
        Assert.assertEquals(statusCode, HTTP_OK);
    }
}
