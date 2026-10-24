
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	int twodarr[][]=new int[5][2];
	System.out.println("enter values");
	for(int i=0;i<5;i++)
	{
	    for(int j=0;j<2;j++)
	    {
	        twodarr[i][j]=s.nextInt();
	    }
	}
	for(int i=0;i<5;i++)
	{
	    for(int j=0;j<2;j++)
	    {
	        System.out.print(twodarr[i][j]+"  ");
	    }
	    System.out.println();                                                 
	}
	}
}
