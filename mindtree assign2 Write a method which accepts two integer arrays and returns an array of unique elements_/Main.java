import java.util.*;
public class Main
{
    public static int[] arrayunique(int arr1[],int arr2[],int n,int m)
    {
       	ArrayList<Integer> list=new ArrayList<Integer>();
       for(int a=0;a<n;a++)
		{
		    int c=0;
		    for(int b=0;b<m;b++)
		    {
		        if(arr1[a]!=arr2[b]) 
		             c++;
		    }
		    if(c==m)
		      list.add(arr1[a]);
		}
			for(int d=0;d<m;d++)
		{
		    int c1=0;
		    for(int e=0;e<n;e++)
		    {
		        if(arr2[d]!=arr1[e]) 
		             c1++;
		    }
		    if(c1==n)
		      list.add(arr2[d]);
		}
		int newarr[]=new int[list.size()];
		int h=0;
		for(Integer i1:list)
		{
		    newarr[h]=i1;
		    h++;
		} 
		return newarr;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
	
		for(int i=0;i<n;i++)
		{
		    arr1[i]=s.nextInt();
		}
		int m=s.nextInt();
		int arr2[]=new int[m];
		for(int j=0;j<m;j++)
		{
		    arr2[j]=s.nextInt();
		}
		System.out.println(Arrays.toString(arrayunique(arr1,arr2,n,m)));
	
	}
}



