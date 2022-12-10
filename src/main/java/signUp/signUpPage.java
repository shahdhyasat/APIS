package signUp;


import Base.Base;
import io.restassured.response.Response;



public class signUpPage extends Base {
   String url="https://sit.maf-dev.auth0.com/dbconnections/signup";

    public Response signupPost(String email, String password){
         signupRequestBody signupRequestBody= new signupRequestBody();
        baseURL(url);
        Response signupResponse= httpRequest().when().headers("Content-Type","application/json","Cookie","did=s%3Av0%3A26d74570-6598-11ed-a3e3-4bbe80ad43ec.Wh%2FF2CHUT%2B5Gz%2BX9Cv1RJa82OldzRdyj%2F%2FdALMXz2c4; did_compat=s%3Av0%3A26d74570-6598-11ed-a3e3-").body(signupRequestBody.requestBody(email,password)).post();
       return signupResponse;

    }


}
