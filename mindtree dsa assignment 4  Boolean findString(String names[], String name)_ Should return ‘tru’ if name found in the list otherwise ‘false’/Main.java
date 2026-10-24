
import java.util.*;
public class Main
{
     public static boolean search(String arr[],String key)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(key))
                 c++;
        }
        if(c>0)
            return true;
            else
            return false;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
    String arr[]=new String[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.next();
	}
	s.nextLine();
	System.out.println("enter the search element");
	String key=s.nextLine();
		System.out.println(search(arr,key));
	}
}

