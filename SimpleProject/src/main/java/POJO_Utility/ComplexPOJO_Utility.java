 package POJO_Utility;

import java.util.List;

public class ComplexPOJO_Utility {

	/*
	 name;
	 phon no;
	 hobbies[ , , ]
	 education[{level;
	 			percentage;
	 			}
	 			{
	 			level;
	 			percentage;
	 			}]
	 address{
	 			homeno;
	 			pincode;
	 		}	
	 */
	
	private String name;
	private int phnno;
	List<String> hobbies;
	List<Education> eduation;
	Address11 address;
	
	public ComplexPOJO_Utility(String name, int phnno, List<String> hobbies, List<Education> eduation,
			Address11 address) {
		super();
		this.name = name;
		this.phnno = phnno;
		this.hobbies = hobbies;
		this.eduation = eduation;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhnno() {
		return phnno;
	}

	public void setPhnno(int phnno) {
		this.phnno = phnno;
	}

	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}


	public List<Education> getEduation() {
		return eduation;
	}

	public void setEduation(List<Education> eduation) {
		this.eduation = eduation;
	}

	public Address11 getAddress() {
		return address;
	}

	public void setAddress(Address11 address) {
		this.address = address;
	}

		public static  class Education{
			private String level;
			private String percentage;
			
			public Education(String level, String percentage) {
				super();
				this.level = level;
				this.percentage = percentage;
			}
			
			public String getLevel() {
				return level;
			}
		
			public void setLevel(String level) {
				this.level = level;
			}
		
			public String getPercentage() {
				return percentage;
			}
		
			public void setPercentage(String percentage) {
				this.percentage = percentage;
			}
		}

		
		
		
		public static  class Address11{
			private String homeno;
			private int pincode;
			
			public Address11(String homeno, int pincode) {
				super();
				this.homeno = homeno;
				this.pincode = pincode;
			}
			public String getHomeno() {
				return homeno;
			}
			public void setHomeno(String homeno) {
				this.homeno = homeno;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
		}
}