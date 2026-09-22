package Pac_2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void CreateOrgTest() {
		String url=System.getProperty("url");
		String username=System.getProperty("username");
		String pass=System.getProperty("pass");
		String browser=System.getProperty("browser");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(pass);
		System.out.println("CreateOrgTest Created Successfully");
	}
	
	@Test
	public void ModifyOrgTest() {
		System.out.println(" ModifyOrgTest Created Successfully");
	}
	
}
