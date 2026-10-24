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
	int n1=s.nextInt();//6
	int n2=s.nextInt(); //5
	int sum=0,c=0;
	int f1=0,f2=1,sum1=0;
	for(int i=1;i<n1;i++)
	{
	    if(n1 % i == 0)
	          sum=sum+i;
	}
	System.out.println(sum);
	int devil=sum % n2;
	System.out.println(devil);
		for(int j=1;j<devil;j++)
	{
	    if(devil % j == 0)
	          c++;
	}
	System.out.println(c);    //0 1 1 2 3 5
	while(sum1<c)//3 2
	{
	    sum1=f1+f2;//1 2 3
	    System.out.print("sum is"+sum1+" ");
	    f1=f2; //1     1 2
	    f2=sum1;//1   2 3
	}
	if(sum1==c)
	  System.out.println("YES");
	  else
	    System.out.println("NO");
	}
}


