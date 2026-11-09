package Rest_Assured;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import POJO_Utility.LoginPOJO_utility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

	public class Test_2 {

	String token;
	String userid;
	
	@Test
	public void t() {
	
	LoginPOJO_utility p=new LoginPOJO_utility("Frontman45@gmail.com", "Blownsky", "SHOPPER");
	
	Response res=given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(p).post("https://www.shoppersstack.com/shopping/users/login");
	 System.out.println(res.prettyPrint());
	 System.out.println (res.getStatusCode());
	 System.out.println(res.getBody());
	 System.out.println(res.getTime());
	 
	 token=res.jsonPath().get("data.jwtToken");
	 userid=res.jsonPath().getString("data.userId");
	 String mail=res.jsonPath().get("data.email");
	 String ln=res.jsonPath().get("data.lastName");
	 System.out.println(ln);
	 System.out.println(token);
	 
	 String id=res.jsonPath().getString("data.userId");
	 
	 res.then().statusCode(200);
	 res.then().assertThat().body("data.firstName", Matchers.equalTo("Shaik"));
	 res.then().time(Matchers.lessThan(1500L));
	 
	 assertEquals(mail, "Frontman45@gmail.com");
	 assertEquals(ln, "Osman");
	
	}
}
