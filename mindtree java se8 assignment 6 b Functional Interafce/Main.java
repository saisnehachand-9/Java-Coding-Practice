
import java.util.*;
interface functionalinterface
{
    void disp(int a,String b);
}
public class Main implements functionalinterface
{
    public void disp(int a,String b)
    {
     System.out.println("******Functional Interface******");   
        System.out.println("pinno is : "+a);
         System.out.println("name is : "+b);
    }
	public static void main(String[] args)     {
		Main m=new Main();
		m.disp(2,"sudha");                                                 
	}
}
