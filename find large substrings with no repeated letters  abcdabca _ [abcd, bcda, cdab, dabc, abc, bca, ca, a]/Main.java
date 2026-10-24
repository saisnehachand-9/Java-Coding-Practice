import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    s1=s1.toLowerCase();// abcdabc  [a,ab,abc,abcd,b,bc,bcd,bcda,c,cd,cda,cdab,]
	    ArrayList<String> list=new ArrayList<>();
	    for(int i=0;i<s1.length();i++)
	    {
	        String substr="";
	       for(int j=i;j<s1.length();j++)
	       {
	           String x=String.valueOf(s1.charAt(j));
	           if(!substr.contains(x)){
	               substr=substr+x;
	           }
	           else{
	               break;
	           }
	       }
	        list.add(substr);
	      
	    }
		System.out.println(list);
	}
}
