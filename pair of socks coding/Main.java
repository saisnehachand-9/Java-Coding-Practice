import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int p=0;
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<n-1;i++)
	{
	    int c=0,store=i;
	    for(int j=i+1;j<n;j++)
	    {
	        if(arr[i]==arr[j])
	        {
	            c++;
	            store=j;
	        }
	    }
	    if(i!=arr.length-1){
	    if(c % 2 == 0)
	       p=p+c-1;
	    else
	       p=p+c;
	    }
	   i=store;
	}
	System.out.println(p);
	}
}
