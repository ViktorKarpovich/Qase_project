package org.tms.api;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.api.adapters.SuiteAdapter;
import org.tms.api.models.Suite;

public class CreateNewSuiteTest {


    @Test
    public void createNewSuiteTest(){
        String projectCode = "VCODE";
        String suiteTitle = "title";
        String suiteDescription = "VCODE";
        String suitePreconditions = "Description";
        Suite suite = Suite.builder()
                .title(suiteTitle)
                .description(suiteDescription)
                .preconditions(suitePreconditions)
                .build();
        boolean status = new SuiteAdapter().createSuite(projectCode, suite).body().path("status");
        Assert.assertTrue(status);
    }
}
