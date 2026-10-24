import java.util.*;
class Customer{
    String Name;
    String MobileNo;
    double feedbackRating;
    Customer()
    {
        
    }
    Customer(String Name,String MobileNo,double feedbackRating)
    {
        this.Name=Name;
        this.MobileNo=MobileNo;
        this.feedbackRating=feedbackRating;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setMobileNo(String MobileNo)
    {
        this.MobileNo=MobileNo;
    }
    public void setfeedbackRating(double feedbackRating )
    {
        this.feedbackRating=feedbackRating;;
    }
    public String getName( )
    {
        return Name;
    }
    public String getMobileNo( )
    {
        return MobileNo;
    }
    public double getfeedbackRating( )
    {
        return feedbackRating;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No of Customers");
		int n=s.nextInt();
		double arr[]=new double[n]; 
		for(int i=0;i<n;i++){
		System.out.println("Enter name");
		String s1=s.nextLine();
		s.nextLine();
		System.out.println("Enter mobile no");
		String mb=s.nextLine();
		System.out.println("Enter feedback");
		double feed=s.nextDouble();
		Customer c=new Customer(s1,mb,feed);https://www.onlinegdb.com/#tab-stdin
		arr[i]=c.getfeedbackRating();
		}
		
		for(int j=0;j<n;j++)
		{
		    System.out.println("customer "+(j+1)+" : "+arr[j] +" out of 5");
		}
	}
}
