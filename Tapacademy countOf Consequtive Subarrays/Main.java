import java.util.*;
public class Main
{
    static int countConescutiveSubarrays(int[] ar,int n)
    {
        int count=0,si=0,ei=0;   // 1 2 4 5 6 8 9 10 11 13
        for(int i=0;i<n-1;i++)
        {
            if(ar[i+1]-ar[i]==1)
            {
                ei++;
            }
            else{
                if(ei-si > 0)
                {
                    count++;
                }
                si=i+1;
                ei=i+1;
            }
        }
        if(ei-si > 0)
                {
                    count++;
                }
        return count;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
System.out.println(	countConescutiveSubarrays(arr,n));
	}
}
