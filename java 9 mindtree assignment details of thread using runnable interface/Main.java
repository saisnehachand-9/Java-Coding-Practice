
public class Main implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
        System.out.println("name of thread is : "+Thread.currentThread().getName());
        System.out.println("Priority of thread is : "+Thread.currentThread().getPriority());
        System.out.println("Id of Thread is : "+Thread.currentThread().getId());
    }
	public static void main(String[] args) {
	Main m=new Main();
	Thread t1=new Thread(m);
	t1.setPriority(6);
	t1.start();
	Main m1=new Main();
	Thread t2=new Thread(m1);
	t2.setPriority(8);
	t2.start();
	}
}
