
public class Main
{
    public static void ar(int x,int y) throws  ArithmeticException
    {
        
         System.out.println(x/y);
          
    }
	public static void main(String[] args){
	  
	  try 
	  {
	      ar(100,0);
	  }
	  catch(ArithmeticException e) 
	  {
	      System.out.println(e);
	  }

	    finally
	    {
	         System.out.println("finally");
	    }
	

	   
		
	}
}
