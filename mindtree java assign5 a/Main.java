import java.util.*;
class greatest
{
   void  greatest(int a,int b,int c)
	{
	    if((a>b)&&(a>c))
	       System.out.println(a);
	   else if((b>a)&&(b>c))
	       System.out.println(b);
	       else
	          System.out.println(c);
	}
}
public class Main extends greatest{
     void greatest(int a,int b,int c)
	{
	    if((a>b)&&(a>c))
	       System.out.println(a);
	   else if((b>a)&&(b>c))
	       System.out.println(b);
	       else
	          System.out.println(c);
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	Main m=new Main();
	  System.out.print("Greatest no using Method Overloading : ");
	m.greatest(a,b,c);
	Main m1=new Main();
	System.out.print("Greatest no using Method Overriding: ");
	m1.greatest(a,b,c);
		}
}
