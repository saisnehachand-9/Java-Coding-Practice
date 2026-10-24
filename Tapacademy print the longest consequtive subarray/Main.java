import java.util.*;
public class Main
{
    static void  printLongestSubarray(int[] ar,int n)
    {
        int si=0,ei=0;      // 1 2 3 5 6 7 8 9 10 11
        int start=0,end=0;
        for(int i=0;i<n-1;i++)
        {
            if(ar[i+1]-ar[i]==1)
            {
                ei++;
            }
            else{
                if(ei-si > end-start)
                {
                   start=si;
                   end=ei;
                }
                si=i+1;
                ei=i+1;
            }
        }
        if(ei-si >end-start)
                {
                   start=si;
                   end=ei;
                }
       for(int i=start;i<=end;i++)
       {
           System.out.print(ar[i]+" ");
       }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
     printLongestSubarray(arr,n);
	}
}
