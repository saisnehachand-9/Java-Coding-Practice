/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
                                                    // red blue green yellow      String card=yellow index starts from  ind=1
                                                                   // op: right dis=2 left dis==1 op: min==1
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String arr[]=new String[n];
	for(int i=0;i<n;i++) // red blue green yellow
	{
	    arr[i]=s.next();
	}
	s.nextLine();
	int ind=s.nextInt();    //1
	String card="yellow";//yellow
	int c1=0,c2=0,count1=0,count2=0;
	    for(int k=ind;k<n;k++)    // MOVE RIGHT
	    {
	        if(k<=n-1){
	            if(!arr[k].equals(card))
	               c1++;
	        }
	        
	                if(arr[k].equals(card))
	                {
	                    count1=c1;
	                    break;
	                }
	               if(!arr[k].equals(card) && k==n-1){
	                   k=-1;
	               }
	               
	        }
	        System.out.println(count1);
	        for(int m=ind;m<n;m--)   //MOVE LEFT   // red blue green yellow
	    {
	        if(m>=0)
	        {
	       if(!arr[m].equals(card))
	          c2++;
	        }
	          if(arr[m].equals(card))
	          {
	              count2=c2;
	              break;
	          }
	          if(!arr[m].equals(card) && m==0)
	          {
	              m=n;
	          }
	               
	        }
	        System.out.println(count2);
	        if(count1<count2)
	          System.out.println("min distance"+count1);
	          else
	           System.out.println("min distance"+count2);
	    
	}
}
