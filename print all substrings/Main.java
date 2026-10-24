import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    s1=s1.toLowerCase();//abc// abcdabc
	    ArrayList<String> list=new ArrayList<>();
	    for(int i=0;i<s1.length();i++)
	    {
	        String substr="";
	       for(int j=i;j<s1.length();j++)
	       {
	           substr=substr+s1.charAt(j);
	           list.add(substr);
	       }
	      
	    }
		System.out.println(list);
	}
}
