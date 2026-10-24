/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    ArrayList<Integer> list=new ArrayList<Integer>();
    ArrayList<Integer> list1=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt(); // 2 4 6 -1 -2
    }
      for(int j=0;j<n;j++)
      {
          for(int k=j+1;k<n;k++)
          {
              int sum=0;
              sum=arr[j]+arr[k];//
              list1.add(sum);
             int avg=sum/2;
              list.add(avg);
          }
      }
      System.out.println(list);
      System.out.println(list1);
      Collections.sort(list);
      Collections.sort(list1);
      System.out.println(list.get(list.size()-1)*list1.get(list1.size()-1));
  }
}
