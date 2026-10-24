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
		      Scanner s=new Scanner(System.in);
		      int n=s.nextInt(); // 234567889
		      int max=Integer.MAX_VALUE; // 214748364 7  1534236469
		      int rev=0;
		      int c=0;
		     int sign=(n<0)?-1:1;
		      n=Math.abs(n);
		      if(n==0)
		        System.out.println(0);
		        else{
		      while(n>0)
		      {
		        int rem=n%10;
		        n=n/10;
		        if(rev> max/10 || ((rev==max/10)&& rem>7 ) ){
		           System.out.println("number exceeds");
		         // c++;
		         // break;
		         return; //if you simply place return then the program stops execution you dont need to use break and use variables like "c"
		           
		        }
		           else
		        rev=rev*10+rem;
		        
		      }
		        }
		      //  if(c==0)
		         System.out.println(rev*sign);
		      
		        }
}
