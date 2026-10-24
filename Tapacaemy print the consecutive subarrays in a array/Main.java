import java.util.*;
public class Main
{
    static void printConescutiveSubarrays(int[] ar,int n)
    {
        int si=0,ei=0;
        for(int i=0;i<n-1;i++)
        {
            if(ar[i+1]-ar[i]==1)
            {
                ei++;
            }
            else{
                if(ei-si > 0)
                {
                   for(int j=si;j<=ei;j++)
                   {
                       System.out.print(ar[j]+" ");
                   }
                    System.out.println();
                }
                si=i+1;
                ei=i+1;
            }
        }
        if(ei-si > 0)
                {
                     for(int j=si;j<=ei;j++)
                   {
                       System.out.print(ar[j]+" ");
                   }
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
printConescutiveSubarrays(arr,n);
	}
}
