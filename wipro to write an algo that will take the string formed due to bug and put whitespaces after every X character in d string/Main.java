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
	String s1=s.nextLine(); // abcdefg
	String res="";
	int x=s.nextInt(); //2
	int c=0;
    int i=0,y=0;
	    while( y <s1.length()){
	    if(c == x)
	    {
	        res=res+" "; // ab cd 
	        c=0; //0
	    }
	    else{
	        char ch=s1.charAt(i); // a b c d e
	        res=res+String.valueOf(ch); //a, ab, ab  ,ab c, ab cd, ab cd   ,ab cd e,ab cd ef,ab cd ef g
	        i++; //1 2   3 4   5
	        c++; //1 2 0 1 2 0 1
	         y++;
	    }
	    // 1 2 3 4 5 6 7
	}
	System.out.println(res);
	}
}
