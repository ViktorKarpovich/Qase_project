package org.tms.api.adapters;

import io.restassured.response.Response;
import org.tms.api.models.Project;
import org.tms.utils.Constants;

public class ProjectAdapter extends BaseAdapter{
    public Response getAllProjects() {
        return get(Constants.PROJECT_API_ENDPOINT);
    }

    public Response createProject(Project project){
        return post(Constants.PROJECT_API_ENDPOINT, converter.toJson(project));
    }
}
