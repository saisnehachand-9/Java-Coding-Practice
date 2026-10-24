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
	String s1=s.nextLine();
	char ch=s.next().charAt(0);
  String new1=s.nextLine();
  for(int i=0;i<s1.length();i++)
  {
      if(s1.charAt(i)!=ch)
          new1=new1+s1.charAt(i);
      
  }
  System.out.println(new1);
	}
}
