package soaLab2;

import java.util.*;

import jakarta.xml.bind.annotation.*;


@XmlRootElement
public class Customer {
	private String name;
	private ArrayList<PhoneNumber> phoneNumbers; 
	
	
	public Customer() {
		phoneNumbers = new ArrayList<PhoneNumber>(); 
	}
	
	public String getName() {
		return this.name;
	}

	
	public void setName(String s) {
		this.name = s;
	}
	
	@XmlElement(name="phone-number")
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	
}
