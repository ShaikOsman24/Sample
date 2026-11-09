package Rest_Assured;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import POJO_Utility.ComplexPOJO_Utility;
import POJO_Utility.ComplexPOJO_Utility.Address11;
import POJO_Utility.ComplexPOJO_Utility.Education;

public class ComplexPOJO {

	@Test
	public void g() {
		
		List<String> al=new ArrayList<String>();
		al.add("eating");
		al.add("Gaming");
		
		Education ed=new Education("Degree", "88");
		Education ed1=new Education("Post Degree", "78");
		
		ArrayList<Education> al1=new ArrayList<>();
		al1.add(ed);
		al1.add(ed1);
		
		Address11 ad=new Address11("Hyderabad", 500082);
		
		ComplexPOJO_Utility p=new ComplexPOJO_Utility("Bard Pitt", 799518654 , al , al1 , ad);
		
	}
	
}
