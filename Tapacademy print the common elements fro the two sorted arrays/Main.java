import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int m=s.nextInt();
	    int arr2[]=new int[m];
	    for(int i=0;i<n;i++)
	    {
	        arr2[i]=s.nextInt();
	    }
	  int a=0,b=0;
	  while(a<arr.length && b<arr2.length)
	  {
	      if(arr[a]==arr2[b]){
	          System.out.println(arr[a]+" ");
	          a++;
	          b++;
	           System.out.println(a+" "+b);
	      }
	      else if(arr[a]>arr2[b])
	      {
	           System.out.println("b : "+b);
	          b++;
	      }
	      else 
	      {
	           System.out.println("a : "+a);
	          a++;
	      }
	  }
	    System.out.println(a+" "+b);
	}
}
