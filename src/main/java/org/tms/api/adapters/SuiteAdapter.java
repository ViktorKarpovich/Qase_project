package org.tms.api.adapters;

import io.restassured.response.Response;
import org.tms.api.models.Suite;
import org.tms.utils.Constants;

public class SuiteAdapter extends BaseAdapter{
    public Response createSuite(String projectCode, Suite suite){
        return post(String.format(Constants.SUITE_API_ENDPOINT, projectCode), converter.toJson(suite));
    }

    public Response getAllSuites(String projectCode) {
        return get(String.format(Constants.SUITE_API_ENDPOINT, projectCode));
    }

    public Response getSpecificSuites(String projectCode, int id) {
        return get(String.format(Constants.SUITE_API_ENDPOINT, projectCode, id));
    }

}
