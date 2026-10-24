/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Car {
	private String licenseNumber;
	private String model;
	private double currentMileage;
	private int engineSize;
	
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getModel() {
		return  model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCurrentMileage() {
		return currentMileage;
	}
	public void setCurrentMileage(double currentMileage) {
		this.currentMileage = currentMileage;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int  engineSize) {
		this.engineSize = engineSize;
	}
	public static void findCarList(String model,Car[]c) {
			int count=0;
			for(int i=0;i<10;i++) {
				if(model.equals(c[i].getModel())) {
					System.out.println(c[i].getLicenseNumber()+"| "+c[i].getModel()+"|"+c[i].getCurrentMileage()+"| "+c[i].getEngineSize());
							count++;
				}
			}
			if(count==0) System.out.println("No cars found");
		}


}
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Object[] c;
        c=new Object[10];
        for(int i=0;i<10;i++)
        {
            c[i]=new Object();
        }
        for(int i=0;i<10;i++){
            System.out.println("enter licenseNumber");
            String x1=s.next();
            System.out.println("enter model");
            String x2=s.nextLine();
            System.out.println("enter current mileage");
            double x3=s.nextDouble();
            System.out.println("enter engine size");
            int x4=s.nextInt();
            c[i]=new Object(x1,x2,x3,x4);
        }
        System.out.println("enter any model");
        String mod=s.nextLine();
         System.out.println(findCarList(mod,c));
    }
}