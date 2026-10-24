import java.util.*;
public class Main {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Customer c = new Customer();
	System.out.println("Enter The customer name");
	String name=sc.next();
	System.out.println("Enter The cutomer Id");
	int id=sc.nextInt();
	System.out.println("Enter The customer Address");
	String address=sc.next();
	System.out.println("Enter Accoount type of customer");
	String type=sc.next();
	System.out.println("Enter balance of customer");
	double bal=sc.nextDouble();
	c.setName(name);
	c.setCId(id);
	c.setAddress(address);
	c.setAccType(type);
	c.setBalance(bal);
	sc.close();
	System.out.println(c.getName());
	System.out.println(c.getCId());
	System.out.println(c.getAddress());
	System.out.println(c.getAccType());
	System.out.println(c.getBalance());
}
}

class Customer
{
	public String Name;
	public String Address;
	public String AccType;
	public int CId;
	public double Balance;
	public Customer(){	
	}
	
	public Customer(String name, String address, String accType, int cId, double balance) {
		Name = name;
	Address = address;
		AccType = accType;
		CId = cId;
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getAccType() {
		return AccType;
	}
	public void setAccType(String accType) {
		this.AccType = accType;
	}
	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		this.CId = cId;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
	
}


