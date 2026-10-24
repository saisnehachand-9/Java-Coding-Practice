import java.util.*;
public class Main
{
     public static void countSubArrays(int arr[],int n,int check) // 1 2 3 4 5 6
     {
         int c=0;
         int size=1;
         while(size<=n)
         {
         for(int i=0;i<=n-size;i++)
         {
             int sum=0;
             for(int j=i;j<(i+size);j++)
             {
                  sum=sum+arr[j];
             }
             if(sum==check){
               c++;
               if(c==1)
               {
                   for(int j=i;j<(i+size);j++)
                   {
                  System.out.print(arr[j]+" ");
                   } 
               }
             }
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
	int check=s.nextInt();
	countSubArrays(arr,n,check);
	}
}
