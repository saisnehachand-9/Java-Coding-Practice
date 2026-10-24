import java.util.*;
public class Main extends Thread
{
    public void run()
    {
        System.out.println("HELLO -"+Thread.currentThread().getName());
        }
	public static void main(String[] args) {
	    
	Scanner s=new Scanner(System.in);
	Main m=new Main();
	Thread t1=new Thread(m);
	t1.start();
	Thread t2=new Thread(m);
	t2.start();
	Thread t3=new Thread(m);
	t3.start();
	Thread t4=new Thread(m);
	t4.start();
	Thread t5=new Thread(m);
	t5.start();
	Thread t6=new Thread(m);
	t6.start();
	Thread t7=new Thread(m);
	t7.start();
	Thread t8=new Thread(m);
	t8.start();
	Thread t9=new Thread(m);
	t9.start();
	Thread t10=new Thread(m);
	t10.start();
	
	}
}
