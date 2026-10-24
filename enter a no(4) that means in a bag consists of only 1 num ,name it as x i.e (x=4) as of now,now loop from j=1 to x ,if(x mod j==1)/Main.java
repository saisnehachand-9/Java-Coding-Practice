/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// enter a no(4) that means in a bag consists of only 1 num ,name it as x i.e (x=4) as of now,now loop from j=1 to x ,if(x mod j==1)then 
//add it to the bag,then again take that element from the bag and repeat the process,finally return how many elements are present 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(); //4
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(n);
	for(int i=0;i<list.size();i++)
	{
	   //System.out.println("list :"+list.size());
	    int x=list.get(i);//5
	    for(int j=1;j<=x;j++)
	    {
	        if(x % j ==1)
	        {
	            list.add(x-j);
	            System.out.println(x+" "+j);
	        }
	    }
	    
	}
	System.out.println(list.size());
	System.out.println(list);
	}
}

