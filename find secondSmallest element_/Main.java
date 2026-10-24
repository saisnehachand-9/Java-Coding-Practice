/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
		     arr[i]=s.nextInt();
		 }
		 int small=arr[0];
		 int secondSmall=Integer.MAX_VALUE;
          for(int i=1;i<n;i++)
          {
              if(arr[i]<small)
              {
                  int temp=small;//10
                  small=arr[i]; //5
                  secondSmall=temp;
              }
              else if(arr[i]>small && arr[i]<secondSmall)
              {
                  secondSmall=arr[i];
              }
                  
              
          }
          System.out.println(secondSmall);
		    
	}
}
