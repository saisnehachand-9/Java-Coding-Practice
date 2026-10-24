/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class carmodel {
	private String LicenseNumber;
	private String Model;
	private double CurrentMileage;
	private int EngineSize;
	
public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public String getModel() {
		return Model;
	}
	public  void setModel(String model) {
		Model = model;
	}
	public double getCurrentMileage() {
		return CurrentMileage;
	}
	public void  setCurrentMileage(double  currentMileage) {
		CurrentMileage = currentMileage;
	}
	public int getEngineSize() {
		return EngineSize;
	}
	public void setEngineSize(int engineSize) {
		EngineSize = engineSize;
	}
}
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=2;
	      car[] c=new car[n];
	      for(int i=0;i<n;i++)
	      {
	          c[i]=new car();
	      }
	    for(int i=0;i<n;i++)
	    {
	        System.out.println("Enter license no : ");
	        c[i].setLicenseNumber(sc.next());
	        System.out.println("Enter model : ");
	        c[i].setLicenseNumber(sc.nextLine());
	        System.out.println("Enter current Mileage : ");
	        c[i].setLicenseNumber(sc.nextDouble());
	        System.out.println("Enter Engine Size : ");
	        c[i].setLicenseNumber(sc.nextInt());
	        
	    }
	}
}
public class Main{
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of cars: ");
int n=sc.nextInt();
carmodel[]  c=new carmodel[n];
for(int i=0;i<n;i++) {
c[i]=new carmodel();
           }
for(int i=0;i<n;i++) {
	System.out.println("Enter license number of car "+(i+1)+": ");
	c[i].setLicenseNumber(sc.next());
	System.out.println("Enter model of car "+(i+1)+": ");
	sc.nextLine();
	c[i].setModel(sc.nextLine());
	System.out.println("Enter current mileage of car "+(i+1)+": ");
	c[i].setCurrentMileage(sc.nextDouble());
	System.out.println("Enter engine size of car "+(i+1)+": ");
	c[i].setEngineSize(sc.nextInt());
	}
System.out.println("License Number | Model | Current Mileage | Engine Size");
for(int i=0;i<n;i++) {
	System.out.println(c[i].getLicenseNumber()+" "+c[i].getModel()+" "+c[i].getCurrentMileage()+" "+c[i].getEngineSize()+" ltrs");
      }
   }
}
