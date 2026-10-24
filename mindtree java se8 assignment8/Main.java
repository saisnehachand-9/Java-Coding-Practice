
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	HashSet<Integer> set=new HashSet<Integer>();
	System.out.println("Enter the max value");
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
	    System.out.println("Enter a number");
	    set.add(s.nextInt());
	}
	Iterator it=set.iterator();
	System.out.println();
		System.out.println("The values are: ");
	while(it.hasNext())
	{
	    System.out.println(it.next());
	}
	
	}
}
