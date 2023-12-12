package soaLab2;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Jane Doe");
		customer.getPhoneNumbers().add(new PhoneNumber("12345"));
		customer.getPhoneNumbers().add(new PhoneNumber("222"));


	}

}
