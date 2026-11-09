package Rest_Assured;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class test_1 {
	
	String token;
	String userid;
	
	
	@Test
	public void test() {
		
		Map hm=new HashMap<>();
		hm.put("email","Frontman45@gmail.com" );
		hm.put("password", "Blownsky");
		hm.put("role", "SHOPPER");
		
		Response res=given().relaxedHTTPSValidation().contentType(ContentType.JSON)
				.body(hm).post("https://www.shoppersstack.com/shopping/users/login");
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
	
	@Test(dependsOnMethods = "test")
	public void test2(){
		given().relaxedHTTPSValidation().pathParam("shopperId", userid).contentType(ContentType.JSON)
		.auth().oauth2(token).get("https://www.shoppersstack.com/shopping/shoppers/{shopperId}");		
	}
}
