import Login.loginPage;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import memberDetails.memberDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class memberDetailsTest extends loginTest {

      memberDetailsPage memberDetailsPage= new memberDetailsPage();

    loginPage loginPage=new loginPage();
    Response memberDetailsResponse;
     public String tokenValue;
    @Test(description = "Validate Status code",priority = 1)
    public void StatusCode() {

        loginResponse = loginPage.loginPost(emailValue, "Password2019");
        JsonPath jsonPathEvaluator = loginResponse.jsonPath();
        tokenValue = jsonPathEvaluator.get("access_token");

        memberDetailsResponse = memberDetailsPage.memberDetailsGet(tokenValue);
        Assert.assertEquals(memberDetailsResponse.getStatusCode(), 200);




    }
   @Test(description = "Validate First Name",priority = 2)
   public void firstName()  {


       String firstNameValue = signupResponse.jsonPath().get("user_metadata.firstName");
       memberDetailsResponse= memberDetailsPage.memberDetailsGet(tokenValue);
      JsonPath jsonPathEvaluator2 = memberDetailsResponse.jsonPath();
       String firstName = jsonPathEvaluator2.get("first_name");
      System.out.println("memberDetails:" + firstName);
       Assert.assertEquals(firstNameValue,firstName);


   }




    @Test(description = "Validate Email", priority = 3)
    public void email()  {
        String firstNameValue = signupResponse.jsonPath().get("email");
        memberDetailsResponse= memberDetailsPage.memberDetailsGet(tokenValue);
        JsonPath jsonPathEvaluator2 = memberDetailsResponse.jsonPath();
        String email = jsonPathEvaluator2.get("email_address");
        System.out.println("memberDetails:" + email);
        Assert.assertEquals(firstNameValue,email);

    }

    @Test(description = "Validate sw_onboarding value" , priority = 4)
    public void swOnboarding() {

       memberDetailsResponse = memberDetailsPage.memberDetailsGet(tokenValue);
        JsonPath jsonPathEvaluator2 = memberDetailsResponse.jsonPath();
        boolean onBoardingValue = jsonPathEvaluator2.get("extra_data.sw_onboarding");
        System.out.println("memberDetails:" + onBoardingValue);
        Assert.assertEquals(onBoardingValue,false);
   }
    @Test(description = "Validate Tier value",priority = 2)
    public void Tier()  {
        memberDetailsResponse = memberDetailsPage.memberDetailsGet(tokenValue);
        JsonPath jsonPathEvaluator2 = memberDetailsResponse.jsonPath();
        String TierValue = jsonPathEvaluator2.get("tier");
        System.out.println("memberDetails:" + TierValue);
        Assert.assertEquals(TierValue,"BASE");


    }
}
