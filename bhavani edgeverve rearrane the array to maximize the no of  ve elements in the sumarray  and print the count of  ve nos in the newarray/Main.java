import java.util.*;
public class Main
{
    public static int maxposprefixes(List<Integer> arr)       // eg: -6 3 4 -10    o/p=3
    {
        Collections.sort(arr);                                  //arrangement = 3 4 -6 -10
        ArrayList<Integer> newlist=new ArrayList<Integer>();    //                3 3+4 7-6 1-10
        ArrayList<Integer> list1=new ArrayList<Integer>();       // 3 7 1 -9   =>3 +ve elements
         ArrayList<Integer> listzero=new ArrayList<Integer>();
          ArrayList<Integer> listless=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++)
         {
             if(arr.get(i)>0)
                  list1.add(arr.get(i));
                  if(arr.get(i)==0)
                    listzero.add(arr.get(i));
                    if(arr.get(i)<0)
                      listless.add(arr.get(i));
            }
            for(int i=0;i<list1.size();i++)
            {
               newlist.add(list1.get(i));
            }
            for(int i=0;i<listzero.size();i++)
            {
               newlist.add(listzero.get(i));
            }
             Collections.sort(listless, Collections.reverseOrder());
            for(int i=0;i<listless.size();i++)
            {
               newlist.add(listless.get(i));
            }
            ArrayList<Integer> l1=new ArrayList<Integer>();
            int  sum=newlist.get(0);
            l1.add(sum);
	  for(int i=1;i<newlist.size();i++)
	  {
	      sum=sum+newlist.get(i);
	      l1.add(sum);
	  }
	  int c=0;
	  for(int i=0;i<l1.size();i++)
	  {
	      if(l1.get(i)>0)
	          c++;
	  }
	  return c;
    }
            
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);  // 2 0 1 -3     0 1 2 -3     1 0 2 -3     2 1 0 -3
	  int n=s.nextInt();
	  int arr[]=new int[n];
	  int newarr[]=new int[n];
	  ArrayList<Integer> list=new ArrayList<Integer>();
	  for(int i=0;i<n;i++)
	  {
	      arr[i]=s.nextInt();
	  }
	   for(int i=0;i<n;i++)
	  {
	     list.add(arr[i]);
	  }
	  System.out.println(maxposprefixes(list));
	}
}
