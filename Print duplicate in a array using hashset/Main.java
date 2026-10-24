/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

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
		    arr[i]=s.nextInt();   // 2 2 3 4 5
		}
	 Arrays.sort(arr);
	 HashSet<Integer> set=new HashSet<Integer>();
	   for(int i=0;i<n-1;i++)
	   {
	       int c=1;
	       for(int j=i+1;j<n;j++)
	       {
	           if(arr[i]==arr[j])
	            c++;
	       }
	       if(c>1)
	          set.add(arr[i]);
	   }
	   for(Integer st:set)
	   {
	       System.out.println(st);
	   }
	}
}
