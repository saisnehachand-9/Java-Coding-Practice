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
		//Arrays.sort(arr);
		int c=0;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]==0)
		       c++;
		}
		int newArray[]=new int[n];
		int index=0;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]!=0){
		         newArray[index]=arr[i];
		         index++;
		    }
		}
		for(int i=index;i<n;i++)
		{
		    newArray[i]=0;
		}
          System.out.println(Arrays.toString(newArray));
		    
	}
}
