/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static List<String> deviceNamesSystem(ArrayList<String> devicenames)
    {
        ArrayList<String> newarr=new ArrayList<String>();
         for(int j=0;j<devicenames.size();j++)
	    {
	        int c=0;
	        for(int k=0;k<j;k++)
	        {
	            if(devicenames.get(j).equals(devicenames.get(k)))
	             c++;
	        }
	        String a=String.valueOf(c);
	        if(c!=0)
	        {
	            newarr.add(j,devicenames.get(j)+a);
	         
	        }
	        else
	             newarr.add(j,devicenames.get(j));
	        
	    }
	return newarr;
//System.out.println(newarr);
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    ArrayList<String> list=new ArrayList<String>();
	    int no=s.nextInt();
	    for(int m=0;m<no;m++)
	    {
	        list.add(s.next());
	    }
	    //deviceNamesSystem(list);
	   System.out.println(deviceNamesSystem(list));
	}
}
