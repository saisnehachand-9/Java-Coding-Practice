
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rating");
		int rating=s.nextInt();
		if(rating > 3)
		   System.out.println("Good Rating");
		   else if(rating <3)
		    System.out.println("Bad Rating");
		   else 
		   System.out.println("Average Rating");      
		   
	}
}
