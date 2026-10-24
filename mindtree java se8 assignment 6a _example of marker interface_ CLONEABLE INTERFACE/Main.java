
import java.util.*;
public class Main implements Cloneable
{
    int pinno;
    String name;
    Main(int pinno,String name)
    {
        this.pinno=pinno;
        this.name=name;
    }
    void display()
    {
     System.out.println("******Cloneable Interface******");   
        System.out.println("pinno is : "+pinno);
         System.out.println("name is : "+name);
    }
	public static void main(String[] args) throws CloneNotSupportedException    {
		Main m=new Main(1,"sneha");
		Main m1=(Main)m.clone();
		m1.display();
	}
}
