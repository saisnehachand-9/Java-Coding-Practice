
import java.util.*;
public class Main extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
        System.out.println("name of thread is : "+Thread.currentThread().getName());
        System.out.println("Priority of thread is : "+Thread.currentThread().getPriority());
        System.out.println("Id of Thread is : "+Thread.currentThread().getId());
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Main m=new Main();
	m.setPriority(5);
	m.start();
	Main m1=new Main();
	m1.setPriority(7);
	m1.start();
	
	}
}
