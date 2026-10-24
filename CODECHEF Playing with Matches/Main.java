/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0)
		{
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int sum=x+y;// 357
		    	int matches=0;
		    while(sum > 0 )
		    {
		        int rem=sum % 10;//7
		        if(rem==2 || rem==3 || rem==5  )
		             matches=matches+5;
		             else if(rem==0 || rem==6 )
		              matches=matches+6;
		               else if(rem==1)
		              matches=matches+2;
		              else if(rem==4)
		              matches=matches+4;
		                else if(rem==7)
		              matches=matches+3;
		                else if(rem==8)
		              matches=matches+7;
		               else if(rem==9)
		              matches=matches+6;
		              
		              sum=sum/10;
		    }
		    System.out.println(matches);
		  //OR 
		  System.out.println("WE can also do it in another way,1st enter the inputs of X and  Y"); 
                int arr[]={6,2,5,5,4,5,6,3,7,6};
                int matches1=0;
		        int X=s.nextInt();
		    int Y=s.nextInt();
		    int SUM=X+Y;// 357
		    while(SUM>0){
		     int rem=SUM % 10;//7
		          matches1=matches1+arr[rem];
		          SUM=SUM/10;
		        }
		     System.out.println(matches1);
		      System.out.println("See,both are same !!");
		} 
	}
}
