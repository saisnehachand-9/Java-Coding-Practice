import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int k=s.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int newarr[]=new int[size];
	    Arrays.sort(arr);
	    int d=0;
	    for(int i=0;i<k;i++)
	    {
	        newarr[i]=arr[i];
	        d=i;
	    }
	    for(int i=size-1;i>=k;i--)
	    {
	        newarr[d]=arr[i];
	        d++;
	    }
		System.out.println(Arrays.toString(newarr));
	}
}
