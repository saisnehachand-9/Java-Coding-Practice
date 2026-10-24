import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    HashSet<Integer> set=new HashSet<Integer>();
	    int n=s.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        set.add(s.nextInt());
	    }
		System.out.println(set);
		for(Integer i:set)
		{
		    	System.out.println(i);
		}
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}

	}
}
