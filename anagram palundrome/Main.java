/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    String arr[]=s1.split(" ");
	    HashSet<String> set=new HashSet<String>();
	    int c=0;
	    System.out.println(Arrays.toString(arr));
	    for(int i=0;i<arr.length;i++)
	    {
	        String str=arr[i].toLowerCase();//
	       char arr1[]=str.toCharArray();//act
	        Arrays.sort(arr1);
	        for(int j=i+1;j<arr.length;j++)
	        {
	            String str1=arr[j].toLowerCase();
	            char arr2[]=str1.toCharArray();
	            Arrays.sort(arr2);
	            if(Arrays.equals(arr1,arr2))
	                {
	                   set.add(str);
	                    
	                }
	        }
	       
	    }
	     System.out.println(set);
	     String arr2[]=new String[set.size()];
	     set.toArray(arr2);
	     System.out.println(Arrays.toString(arr2));
	     for(int k=0;k<arr2.length;k++)
	     {
	         String a=arr2[k];
	         System.out.println(a);
	         String rev="";
	         for(int l=a.length()-1;l>=0;l--)
	         {
	             rev=rev+a.charAt(l);
	         }
	         if(a.equals(rev))
	              System.out.println("palindromes");
	              else
	              System.out.println("not a palindromes");
	     }
	}
}
