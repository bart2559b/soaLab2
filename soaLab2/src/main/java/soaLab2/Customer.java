package soaLab2;

import java.util.*;

import jakarta.xml.bind.annotation.*;


@XmlRootElement
public class Customer {
	public String name;
	public List<PhoneNumber> PhoneNumbers; 
	
	
	public Customer() {
		PhoneNumbers = new ArrayList<>(); 
	}

	
	public void setName(String s) {
		this.name = s;
	}
	
	@XmlElement(name="phone-number")
	public List<PhoneNumber> getPhoneNumbers() {
		return PhoneNumbers;
	}
}
