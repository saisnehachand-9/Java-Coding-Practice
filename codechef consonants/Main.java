/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    //String s1=s.next();
	     int p=0;
	    int n=s.nextInt();
	    while(n-->0){
	        int len=s.nextInt();
	    String s1=s.next();
	    if(len==s1.length()){
	   
	    for(int i=0;i<s1.length();i++)
	    {
	        int c=0;
	        for(int j=i;j<s1.length();j++)
	        {
	             if(s1.charAt(j)!='a' && s1.charAt(j)!='e' && s1.charAt(j)!='i' && s1.charAt(j)!='o' && s1.charAt(j)!='u' )
	             {
	                           c++;
		                     //  System.out.println(s1.charAt(j)+" "+c);
	             }
		                else
		                {
		                    // System.out.println(s1.charAt(j)+" "+c);
		                break;
		                }
	        }
	        if(c>=4){
	            System.out.println("NO");
	            p++;
	            break;
	        }
	    }
	    }
	    }
	    if(p==0)
	        System.out.println("YES");
	       
		
	}
}
