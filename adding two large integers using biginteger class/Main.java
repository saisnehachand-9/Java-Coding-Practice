/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.Stri

*******************************************************************************/
import java.math.BigInteger;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
//	BigInteger x=new BigInteger(s.next());
int x=s.nextInt();
		int arr[]=new int[x];
		BigInteger sum=new BigInteger("0");
	for(int i=0;i<arr.length;i++ )
	{
	     int j=s.nextInt();
	     arr[i]=j;
		}
		for(int k=0;k<arr.length;k++)
		{
		    BigInteger z=new BigInteger(String.valueOf(arr[k]));
		    sum=sum.add(z);
		}
		System.out.print(sum);
}

}