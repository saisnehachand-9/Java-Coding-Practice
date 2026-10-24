import java.util.*;
public class Main
{
     public static void countSubArrays(int arr[],int n) // 1 2 3 4 5 6
     {
         int c=0;
         int size=1;
         while(size<=n){
         for(int i=0;i<=n-size;i++)
         {
             for(int j=i;j<(i+size);j++)
             {
                  System.out.print(arr[j]+" ");
             }
              System.out.println();
         }
         size++;
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
	}
}
