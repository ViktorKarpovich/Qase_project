package org.tms.ui.testsAPI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.api.adapters.ProjectAdapter;
import org.tms.api.models.Project;

public class CreateNewProjectTest {

    @Test
    public void createNewProjectTest(){
        String projectTitle = "title";
        String projectCode = "VCODE";
        String projectDescription = "Description";
        Project project = Project.builder()
                .title(projectTitle)
                .code(projectCode)
                .description(projectDescription)
                .build();
        String resultCode = new ProjectAdapter().createProject(project).body().path("result.code");
        Assert.assertEquals(resultCode, projectCode);
    }
}
