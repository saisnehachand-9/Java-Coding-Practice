import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();//abcabbdcd
		char[] arr=s1.toCharArray();
	//	Arrays.sort(arr);
	//	String s2=new String(arr);
	//	System.out.println(s2);
		for(int i=0;i<arr.length;i++)
		{
		    int c=1;
		  for(int j=0;j<arr.length;j++)
		  {
		      if(i!=j)
		      {
		          if(arr[i]==arr[j])
		           c++;
		      }
		  }
		    if(c==1){
		     System.out.println(arr[i]);
		     return;
		    }
		}
		
	}
}
