package Login;

import Base.Base;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import signUp.signupRequestBody;

public class loginPage extends Base {
    loginRequestBody loginRequestBody= new loginRequestBody();
    String url="https://sit.maf-dev.auth0.com/oauth/token";
    Response loginResponse;
    public Response loginPost(String email, String password) {

        baseURL(url);
        loginResponse = httpRequest().when().headers("accept", "application/json", "Content-Type", "application/json", "Cookie", "did=s%3Av0%3A26d74570-6598-11ed-a3e3-4bbe80ad43ec.Wh%2FF2CHUT%2B5Gz%2BX9Cv1RJa82OldzRdyj%2F%2FdALMXz2c4; did_compat=s%3Av0%3A26d74570-6598-11ed-a3e3-4bbe80ad43ec.Wh%2FF2CHUT%2B5Gz%2BX9Cv1RJa82OldzRdyj%2F%2FdALMXz2c4").body(loginRequestBody.requestBody(email, password)).post();
        return loginResponse;

    }
       // @Test
       // public void test() {
           // loginPost("shahd.maf0.35374375245326894@yopmail.co.ae", "Password2019");
           // Assert.assertEquals(loginResponse.getStatusCode(), 200);
       // }


}
