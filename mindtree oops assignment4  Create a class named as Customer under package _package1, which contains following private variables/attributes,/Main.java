package package1;
import java.util.Scanner;
class Customer{
	private long id;
	private String name;
	private char gender;
	private String email;
	private String contactNumber;
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
		public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		public void setNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
		public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
    public String getcontactNumber() {
		return contactNumber;
	}

	public void tostring() {
		System.out.println("Customer: "+name);
		System.out.printf("Customer contact details: %s,%s",contactNumber,email);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer c1=new Customer();
		System.out.println("Enter id , name , gender , email ,number ");
		long id=sc.nextLong();
		String name=sc.next();
		char gender=sc.next().charAt(0);
		String email=sc.next();
		String number=sc.next();
		c1.setId(id);
		c1.setName(name);
		c1.setGender(gender);
		c1.setEmail(email);
		c1.setNumber(number);
		System.out.println("Customer id: "+c1.getId());
		c1.tostring();
	}
}

