import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();//aabbccdde
		char[] arr=s1.toCharArray();
		Arrays.sort(arr);
		String s2=new String(arr);
		System.out.println(s2);
		for(int i=0;i<arr.length;i++)
		{
		  
		  if(i==0){
		       if(arr[i+1]!=arr[i])
		           System.out.print(arr[i]+" ");
		  }
		  else if(i==arr.length-1) {
		            if(arr[i-1]!=arr[i])
		                System.out.print(arr[i]+" ");
		  }
		   else
		       {
		           if((arr[i-1]!=arr[i]) && (arr[i+1]!=arr[i]))
		               System.out.print(arr[i]+" ");
		       }
		}
		
	}
}
