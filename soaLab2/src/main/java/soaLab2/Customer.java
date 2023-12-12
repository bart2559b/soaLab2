package soaLab2;

import java.util.*;

public class Customer {
	public String name;
	public List<PhoneNumber> PhoneNumbers; 
	
	
	public Customer() {
		List<PhoneNumber> PhoneNumbers = new ArrayList<>(); 
	}

	
	public void setName(String s) {
		this.name = s;
	}
	
	public List<PhoneNumber> getPhoneNumbers() {
		return PhoneNumbers;
	}
}
