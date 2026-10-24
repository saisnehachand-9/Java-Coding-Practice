import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    if(s1==null || s1.trim().isEmpty())
	      System.out.println("empty string");
	      else
	      {
	          String arr[]=s1.trim().split(" ");
	          System.out.println(arr.length);
	      }
	}
}
