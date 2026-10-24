import java.util.*;
public class Main
{
  	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);  // 2 0 1 -3     0 1 2 -3     1 0 2 -3     2 1 0 -3
	  int n=s.nextInt();
	  int arr1[]=new int[n];
	  //int newarr[]=new int[n];
	  ArrayList<Integer> arr=new ArrayList<Integer>();
	  for(int i=0;i<n;i++)
	  {
	      arr1[i]=s.nextInt();
	  }
	   for(int i=0;i<n;i++)
	  {
	     arr.add(arr1[i]);
	  }
	  Collections.sort(arr);
        ArrayList<Integer> newlist=new ArrayList<Integer>();
        ArrayList<Integer> list1=new ArrayList<Integer>();
         ArrayList<Integer> listzero=new ArrayList<Integer>();
          ArrayList<Integer> listless=new ArrayList<Integer>();    //  8 -1 2 -9 -6 2
        for(int i=0;i<arr.size();i++)                             // =>  2  2  8 -1 -6 -9    posotive va;ues =4- 5
         {
             if(arr.get(i)>0)                                   // 8 2 2 -1 -6 -9
                  list1.add(arr.get(i));                         // =>8 10 12 11 5 -4          posotive va;ues =4
                  if(arr.get(i)==0)                              // 2 8 2 -1 -6 -9
                    listzero.add(arr.get(i));                   //=> 2 10 12 11 5               posotive va;ues =4
                    if(arr.get(i)<0)                            // 2 8 2 -9 -6 -1
                      listless.add(arr.get(i));                 //=> 2 10 12 3 -3 -4          posotive va;ues =4
            }                                                 
            for(int i=0;i<list1.size();i++)                     // 2 8 2 -6 -9 -1
            {                                                   //=>2 10 12 6 -3 -4    =>posotive va;ues =4
               newlist.add(list1.get(i));                      //2 8 2 -1 -9 -6
            }                                                  //2 10 12 11 2 -4             =>positive vallues =5
            for(int i=0;i<listzero.size();i++)
            {
               newlist.add(listzero.get(i));
            }
           Collections.sort(listless, Collections.reverseOrder());
            System.out.println("list less "+listless);
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
	  System.out.println(l1);
	}
}