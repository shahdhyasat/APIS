import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import signUp.signUpPage;

public class signupTest {
    signUpPage signUpPage = new signUpPage();
    public String emailValue;
    public String firstName;

    Response signupResponse;
    @Test(description = "Check the status Code and save the email address")
    public void statusCode(){
        String email= "shahd.maf" + Math.random()  + "@yopmail.co.ae";
        signupResponse=signUpPage.signupPost(  email,"Password2019");
        Assert.assertEquals(signupResponse.getStatusCode(),200);
        JsonPath jsonPathEvalutor= signupResponse.jsonPath();
        emailValue =jsonPathEvalutor.get("email").toString();
        firstName= jsonPathEvalutor.get("user_metadata.firstName");
        





    }

}


