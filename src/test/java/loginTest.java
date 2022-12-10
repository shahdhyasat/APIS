import Login.loginPage;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import signUp.signUpPage;

public class loginTest extends signupTest {

    loginPage loginPage = new loginPage();

     Response loginResponse;
   @Test(description = "Check the status Code and save the token")

  public void login() {

       statusCode();
       String emailValue = signupResponse.jsonPath().get("email");
       loginResponse = loginPage.loginPost(emailValue,"Password2019");
       Assert.assertEquals(loginResponse.getStatusCode(), 200);
      JsonPath jsonPathEvalutor= loginResponse.jsonPath();
      String tokenValue =jsonPathEvalutor.get("access_token").toString();
      System.out.println("Token:"+tokenValue);

   }
}
