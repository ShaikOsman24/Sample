package Pac_1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void CreateContactTest() {
		
		String url=System.getProperty("url");
		String username=System.getProperty("username");
		String pass=System.getProperty("pass");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(pass);
		
		System.out.println("CreateContactTest Created Successfully");
	}
	
	@Test
	public void ModifyContactTest() {
		System.out.println(" ModifyContactTest Created Successfully");
	}
	
}
