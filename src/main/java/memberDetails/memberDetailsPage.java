package memberDetails;

import Base.Base;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class memberDetailsPage extends Base {
   String bearer = "Bearer";
    String url = "https://maf-holding-dev.apigee.net/v1/gravity/dk-gravity-memberdetails";

    public Response memberDetailsGet(String token) {

        baseURL(url);
        Response detailsResponse = httpRequest().when().headers("Content-Type", "application/json", "Accept-Language","AE-en", "x-api-key", "GfqP7b2I99sUMkbxGEk5Xk56RscaWRuo", "Authorization", bearer+ " " +token).get();
        return detailsResponse;
    }



}
