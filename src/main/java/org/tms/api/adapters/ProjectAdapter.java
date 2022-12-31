package org.tms.api.adapters;

import io.restassured.response.Response;
import org.tms.api.models.Project;

import static org.tms.api.utils.Constants.PROJECT_API_ENDPOINT;

public class ProjectAdapter extends BaseAdapter{
    public Response getAllProjects() {
        return get(PROJECT_API_ENDPOINT);
    }

    public Response createProject(Project project){
        return post(PROJECT_API_ENDPOINT, converter.toJson(project));
    }
}
