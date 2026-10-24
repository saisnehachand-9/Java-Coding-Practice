/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
	      int n1=1;
		while(n1>=1){
		    	System.out.println("Enter percentage of salary");
		    		double percentage=s.nextDouble();
	 	if(percentage < 0 || percentage > 20){
	 	   System.out.println(percentage+"is an invalid percentage");
	 	   break;
	 	}
	 	System.out.println("Enter the Year of experience");
		double experience=s.nextDouble();
	 	if(experience < 0 || experience > 15){
		   System.out.println(experience+"is an invalid year of experience");
		   break;}
if((percentage > 0 || percentage < 20) && (experience > 0 || experience < 15) ){
		    double permonthsalary=12000+(2000*(experience));
		   double dayshiftsalary=permonthsalary*6;
		    double nightshiftsalary=(((permonthsalary*percentage)/100)+permonthsalary)*6;
		   double annualincome=dayshiftsalary+nightshiftsalary;
		    System.out.println("The annual salary of "+name+"is "+annualincome);
		}
		n1--;
		    
		}
	}
}
