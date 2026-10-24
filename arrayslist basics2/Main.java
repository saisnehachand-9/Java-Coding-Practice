import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   ArrayList<Integer> list=new ArrayList<Integer>();
	   int n=s.nextInt();
	   for(int i=0;i<n;i++)
	   {
	       list.add(i,s.nextInt());
	   }
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--)
		{   
		    if(i!=0)
		    System.out.print(list.get(i)+",");
		    else
		    System.out.print(list.get(i));
		}
		System.out.println();
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(6,3,8,2,-9,0,5));
		int large=list2.get(0);
		int small=Integer.MAX_VALUE;
		for(int i=0;i<list2.size();i++)
		{
		     if(list2.get(i)>large)
		          large=list2.get(i);
		          if(list2.get(i)<small)
		            small=list2.get(i);
		}
		System.out.print("large : "+large+" small : "+small);
	}
}
