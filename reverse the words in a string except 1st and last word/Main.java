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
	    String s2=s.nextLine();
	    String end="";
	    String arr[]=s2.split(" "); //i,am,sai,sneha
	for(int i=0;i<arr.length;i++)
	{
	    if(i!=0 && i!=arr.length-1)
	    {
	        String x=arr[i];
	        String res="";
	        for(int j=x.length()-1;j>=0;j--)
	        {
	            res=res+x.charAt(j);
	        }
	        arr[i]=res;
	    }
	        
	}
	System.out.println(Arrays.toString(arr));
	for(int k=0;k<arr.length;k++)
	{
	   end=end+arr[k]; //i ma ias sneha
	    if(k!=arr.length-1)
	         end=end+" ";//i ma ias sneha
	}
	System.out.println(end);
	}
}
