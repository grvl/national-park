package nationalPark;

public class PhoneNumber {
	private String phoneNumber;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) throws Exception {
		   if (!phoneNumber.startsWith("+")) {
			   throw new Exception("Phone must include country code.");
		   }
		   
		   if (!phoneNumber.matches("\\+\\d+")) {
			   throw new Exception("Phone must only include numbers.");
		   }
		   
		   this.phoneNumber = phoneNumber;
	}
}
