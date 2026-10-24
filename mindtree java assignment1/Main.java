
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s.nextInt();
			System.out.println("Enter value of b");
			int b=s.nextInt();
				System.out.println("Enter value of c");
				int c=s.nextInt();
					System.out.println("Enter value of d");
					int d=s.nextInt();
					System.out.println("The result of AND operator of (a>b) &&(b>c) is : " +((a>b) &&(b>c)));
					System.out.println("The result of OR operator of (a<b) || (b>c) is : " +((a<b) || (b>c)));
					System.out.println("The result of NOT operator of !(a>b) is : " +!(a>b));
					System.out.println("Addition  of " +a+"+"+d +"  is : "+(a+d));
					System.out.println("Subtraction  of " +d+"-"+b +" is : "+(d-b));
					System.out.println("Multiplication of  " +b+"*"+a +"  is : "+(b*a));
					System.out.println("Division of  " +b+"/"+d +"  is : "+(b/d));
	}
}
