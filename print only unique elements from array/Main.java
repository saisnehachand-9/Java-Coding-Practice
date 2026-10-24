import java.util.*;
class Main
{
	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  System.out.println("enter 1st array");
	  int arr1[]=new int[n]; // 1 2 1 3 4 3
	  for(int i=0;i<n;i++)
	  {
	      arr1[i]=s.nextInt();
	  }
	    
	      HashSet<Integer> set=new HashSet<Integer>();//1 2 3 4 
	      for(int i=0;i<n;i++)
	      {
	          set.add(arr1[i]);
	      }
	      	System.out.println(set);
	      Boolean NotFound=true;
	      Iterator<Integer> it=set.iterator();
	      while(it.hasNext())
	      {
	          int j=it.next();
	          
	          int c=0;
	          	//System.out.println("j: "+j+" count : "+c);
	          for(int i=0;i<n;i++)
	          {
	              if(arr1[i]==j)
	                 c++;
	                 NotFound=false;
	                // return;
	          }
	          //	System.out.println("j: "+j+" count : "+c);
	          if(c>1)
	            	System.out.print(j+" ");
	      }
	       if(!NotFound)
	       	System.out.print("not found");
	
	}
}
