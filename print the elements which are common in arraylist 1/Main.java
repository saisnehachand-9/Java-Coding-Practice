import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    ArrayList<String> list=new ArrayList<>(Arrays.asList("sai","sneha","sudha","sai"));
	    ArrayList<String> list1=new ArrayList<>();
	    boolean found=false;
	    for(int i=0;i<list.size();i++)
	    {
	        int c=1;
	        for(int j=0;j<list.size();j++)
	        {
	            if(i!=j)
	               {
	                   if(list.get(i).equals(list.get(j)) && (!list1.contains(list.get(i))) ){
	                       list1.add(list.get(i));
	                       	 c++;
	                        found=true;
	                   }
	                        //System.out.println("element  :"+list.get(i)+" count : "+c+" j: "+j);
	               }
	        }
	        if(c>1)
	        	System.out.println(list.get(i));
	    }
	 if(!found)
	   System.out.println("not found");
	}
}
