package Practice;

import io.restassured.response.Response;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class test_1 {

	String token;
	String userId;
	
	@Test
	public void t() {
		
		HashMap<String , String> hm=new HashMap<String, String>();
		hm.put("email","Frontman45@gmail.com" );
		hm.put("password", "Blownsky");
		hm.put("role", "SHOPPER");
		
		
	    Response res=given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(hm).post("https://www.shoppersstack.com/shopping/users/login");	
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody());
		System.out.println(res.getContentType());
		System.out.println(res.getTime());
		System.out.println(res.prettyPeek());
		
	    userId=res.jsonPath().get("data.userId").toString();
		System.out.println(userId);
		token=res.jsonPath().get("data.jwtToken");
		String ln=res.jsonPath().get("data.lastName");
		
		res.then().statusCode(200);
		res.then().time(Matchers.lessThan(1500L));
		res.then().assertThat().body("data.lastName", Matchers.equalTo(ln));
		
		
	}
	
	
	@Test(dependsOnMethods = "t")
	public void t2() {
		
		given().relaxedHTTPSValidation().auth().oauth2(token).get("https://www.shoppersstack.com/shopping/"+userId);
		
	}
	
}
