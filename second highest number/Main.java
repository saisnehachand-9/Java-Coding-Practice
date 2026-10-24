/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   
	int price1 =11;   //int secondlow=high(45)
	int price2 =8;    
	int price3= 45;
	int price4 = 5;        
	int seconhigh=0;
	 int high= 45;
	if(price1 > seconhigh && price1 != high)
	        seconhigh=price1;  //10
	        	if(price2 > seconhigh && price2!= high)
	                    seconhigh=price2;
	        	if(price3 > seconhigh && price3 != high)
	                  seconhigh=price3;
	        	if(price4 > seconhigh && price4 != high)
	                   seconhigh=price4;
	                   
	                   System.out.println(seconhigh);
	
	}
}
