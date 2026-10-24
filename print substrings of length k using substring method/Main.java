import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    int n=s.nextInt();
	    if(s1.length()>=n && s1>0){
	    for(int i=0;i<=s1.length()-n;i++)  //abcde // abc 
	    {
	          	System.out.println(s1.substring(i,(i+n)));
	    }   
	    }
	    else
	    System.out.println("not found");
	} 
}
