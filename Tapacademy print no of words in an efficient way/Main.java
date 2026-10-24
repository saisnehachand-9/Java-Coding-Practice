
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in); // b*an*an*a
		String str=s.nextLine();
		String s1=str.trim();
	int c=1;
	String res="";
	for(int i=0;i<s1.length()-1;i++)
	{
	   
	    if(s1.charAt(i)!=' ')
	    {
	          res=res+s1.charAt(i);
	          //	System.out.println(res+" "+c);
	    }
	          else
	          {
	              if(s1.charAt(i+1)!=' ')
	                  c++;
	              res="";
	          }
	          
	}
	
		System.out.println(c);
		
		        //or   you can simply write like this
		        	// for(int i=0;i<s1.length()-1;i++)
                     //  	{
	                 //  if(s1.charAt(i)=' '  && (i+1)!=' ')
	                 //          c++;
                     // 	}

		        
	}
}
