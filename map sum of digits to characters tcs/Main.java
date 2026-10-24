/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	
	
	int i=0;
	char arr[]=new char[26];
	void Arr(int no)
	{
	    for(char a='A';a<='Z';a++)
       {
	    arr[i]=a;
	    i++;
       }
	   System.out.println(Arrays.toString(arr));
	}
	void disp()
	{
	    int sum=0;
	while(x > 0)
	{
	    int rem=x % 10;
	    sum=sum+rem;
	    x=x/10;
	}
	if(sum>=1 && sum<=26)
	{
	    System.out.println(arr[sum-1]);
	}
	else{
	  disp(sum);
	}
	}
	public static void main(String[] args) {
             int y=998
             int i=0;
	       Main m=new Main();
	       m.Arr();
            m.disp(y);
	}
}
