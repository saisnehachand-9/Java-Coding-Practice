import java.util.*;
public class Main
{
     public static void countSubArrays(int arr[],int n) // 1 0 2 3 4 0 5 0 6
     {
         int i=0;
         int j=0;
        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                i++;
            }
            else
            {
                arr[j]=arr[i];
                i++;
                j++;
            }
        }
        while(j<arr.length)
        {
            arr[j]=0;
            j++;
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
	countSubArrays(arr,n);
	System.out.println(Arrays.toString(arr));
	}
}
