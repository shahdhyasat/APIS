package signUp;

public class signupRequestBody {
    public static String requestBody(String email, String password){
       String request="{\n" +
               "    \"password\": \""+password+"\",\n" +
               "    \"username\": \"TestUser\",\n" +
               "    \"user_metadata\": {\n" +
               "        \"firstName\": \"Hasan\",\n" +
               "        \"mobile\": \"+962797531543\",\n" +
               "        \"lastName\": \"Abunimreh\",\n" +
               "        \"dateOfBirth\": \"1988-04-20\",\n" +
               "        \"title\": \"Mr\",\n" +
               "        \"share_tc\": \"Yes\"\n" +
               "    },\n" +
               "    \"email\": \""+email+"\",\n" +
               "    \"connection\": \"Username-Password-Authentication\",\n" +
               "    \"client_id\": \"2IGVUsTpid0NZhjaMUe77k6wERpZ0pbG\"\n" +
               "}";
       return request;


    }
}
