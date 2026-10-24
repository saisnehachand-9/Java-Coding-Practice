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
	int add1;
	int arr[][]=new int[n][n];
	int x=s.nextInt();
	int sum=0;
	int sum1=0;
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        arr[i][j]=s.nextInt();
	    }
	}
	for(int k=0;k<n;k++)
	{
	System.out.println(Arrays.toString(arr[k]));
	}
	for(int a=0;a<n;a++)
	{
	    for(int b=0;b<n;b++)
	    {
	        if(arr[a][b]==x)
	           {
	               sum=sum+a+b+2;
	               System.out.println("sum: "+sum);
	               if(sum % 2==0)
	                    for(int c=0;c<n;c++)
        {
            for(int d=0;d<n;d++)
            {
                if((arr[c][d]) % 2 ==0) //22
                   {
                       String str=String.valueOf(arr[c][d]);
                       for(int e=0;e<str.length();e++)
                       {
                          sum1=sum1+Character.getNumericValue(str.charAt(e)); 
                       }
                   }
            }
	                
	           }
	    }
	}
	}
	System.out.println(sum1);
}
}
