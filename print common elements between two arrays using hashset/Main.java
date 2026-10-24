import java.util.*;
class Main
{
	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  System.out.println("enter 1st array");
	  int arr1[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	      arr1[i]=s.nextInt();
	  }
	    int arr2[]=new int[n];
	    System.out.println("enter 2nd array");
	  for(int i=0;i<n;i++)
	  {
	      arr2[i]=s.nextInt();
	  }
	      HashSet<Integer> set=new HashSet<Integer>();
	      for(int i=0;i<n;i++)
	      {
	          set.add(arr1[i]);
	      }
	      
	        HashSet<Integer> set2=new HashSet<Integer>();
	      for(int i=0;i<n;i++)
	      {
	          
	              if(set.contains(arr2[i])){
	                  set2.add(arr2[i]);
	              }
	      }
	   
		System.out.println(set2);
	}
}
