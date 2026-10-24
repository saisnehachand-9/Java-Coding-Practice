
import java.util.*;
public class Main
{
     public static boolean search(int arr[],int key)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
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
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	System.out.println("enter the search element");
	int key=s.nextInt();
		System.out.println(search(arr,key));
	}
}

