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
	int n=s.nextInt();
	ArrayList<Integer> odd=new ArrayList<Integer>();
	ArrayList<Integer> even=new ArrayList<Integer>();
	int arr[]=new int[n];
	int c1=0;
	int c2=1;
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	for(int j=0;j<n;j++)
	{
	    if(arr[j]%2==0)    // 2 4
	       even.add(arr[j]);
	       else
	       odd.add(arr[j]);    // 1 3 5
	}
	System.out.println(odd);
	System.out.println(even);
	for(int k=0;k<odd.size();k++)   //1 3
	{
	    if(c1<arr.length)
	    {
	       arr[c1]=odd.get(k);  
             c1=c1+2 ;
	    }
	}
	for(int m=0;m<even.size();m++)   //18 2 6 90 4
	{
	    if(c2<arr.length)
	    {
	    arr[c2]=even.get(m);
	    c2=c2+2;
	    }
	}
	System.out.println(Arrays.toString(arr));
	}
}
