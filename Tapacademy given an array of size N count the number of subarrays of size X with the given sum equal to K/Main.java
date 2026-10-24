import java.util.*;
public class Main
{
     public static void countSubArrays(int arr[],int n,int size,int sum) // 1 2 3 4 5 6
     {
         int c=0;
         for(int i=0;i<=n-size;i++)
         {
             int SUM=0;
             for(int j=i;j<(i+size);j++)
             {
                 SUM=SUM+arr[j];
             }
             if(SUM==sum)
             c++;
              //System.out.println(SUM);
         }
         System.out.println("count is : "+c);
     }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	int size=s.nextInt();
	int sum=s.nextInt();
	countSubArrays(arr,n,size,sum);
	}
}
