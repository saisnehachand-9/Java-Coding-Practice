import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s1="ssnehhaaa";
	    int a=0;
	  String arr[]=s1.split("");
	
	
	   System.out.println(Arrays.toString(arr));
	   String s2="";
	
	for(int i=0;i<arr.length;i++)
	{
	    int c=1;
	    for(int j=i+1;j<arr.length;j++)
	    {
	        if(arr[i].equals(arr[j]))
	           c++;
	    }
	    if(!s2.contains(arr[i])){
	        s2=s2+arr[i];
	    System.out.println(arr[i]+" : "+c); 
	    }
	}
	
	}
}
