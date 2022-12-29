package org.tms.ui.testsAPI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.api.adapters.ProjectAdapter;
import org.tms.api.adapters.SuiteAdapter;

import static java.net.HttpURLConnection.HTTP_OK;

public class GetAllSuitesTest {
    private String projectCode = "VCODE";
    @Test
    public void getAllSuitesTest(){
        int statusCode = new SuiteAdapter().getAllSuites(projectCode).statusCode();
        Assert.assertEquals(statusCode, HTTP_OK);
    }
}
