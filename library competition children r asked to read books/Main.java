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
	int in1=s.nextInt();
	int time=s.nextInt();
	int points[]=new int[in1];
	int timeofeach[]=new int[in1];
	for(int i=0;i<in1;i++)
	{
	    points[i]=s.nextInt();
	    timeofeach[i]=s.nextInt();
	}
	System.out.println(Arrays.toString(points));
		System.out.println(Arrays.toString(timeofeach));
		int larg1=0,larg2=0,a=0,a1=0,b=0;
		for(int j=0;j<in1;j++)
		{
		    for(int k=j+1;k<in1;k++)
		    {
		        if(timeofeach[j]+timeofeach[k]<=time && (timeofeach[j]+timeofeach[k] >larg1))
		             {
		                 larg1=timeofeach[j]+timeofeach[k];
		                  a=j;
		                  b=k;
		             }
		    }
		    if(timeofeach[j]<=time &&(timeofeach[j]>larg2))
		    {
		        larg2=timeofeach[j];
		        a1=j;
		    }
		}
		if(larg1>larg2)
		System.out.println(points[a]+points[b]);
		else
			System.out.println(points[a1]);
	}
}
