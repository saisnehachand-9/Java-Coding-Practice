/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s1=new Scanner(System.in);
	    String s=s1.next();
	    int k=s1.nextInt();
	   String smallest = "";
        String largest = "";
       
        for(int i=0;i<=s.length()-k;i++)
        {
            String str=String.valueOf(s.charAt(i));
            int j=i+1;
             int c=0;
                while(c<(k-1)){
                str=str+s.charAt(j);
                j++;
                c++;
                }
            if(i==0)
            {
                smallest=str;
                largest=str;
            }
           //System.out.println(str);
           if(str.compareTo(smallest)<0)
                smallest=str;
               if(str.compareTo(largest)>0)
                largest=str;
            
        }
        System.out.println();
	System.out.println("smallest : "+smallest);
	System.out.println("largest : "+largest);
	}
}
