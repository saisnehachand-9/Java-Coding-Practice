public class Main extends Thread{    
 public void run(){    
  try{
      for(int i=0;i<5;i++)
      {
            
          Thread.sleep(8000);
        System.out.println(i);
      }
  }  
  catch(Exception e)
  {
      System.out.println(e);
  }
 }    
 public static void main(String args[]){    
  Main t1=new Main();    
 Main t2=new Main();    
     Main t3=new Main();
  t1.start();    
  //t2.start();  
  //t3.start();
 }    
} 