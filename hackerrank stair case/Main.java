import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=n-1;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<k;j++)
		    {
		        System.out.print(" ");
		        
		    }
		    k--;
		    
		    for(int m=0;m<=i;m++)
		    {
		        System.out.print("*");
		        
		    }
		    System.out.println();
		}
	}
}
