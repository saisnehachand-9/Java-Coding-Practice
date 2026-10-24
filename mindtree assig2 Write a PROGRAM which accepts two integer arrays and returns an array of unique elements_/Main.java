import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		ArrayList<Integer> list=new ArrayList<Integer>();
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
	//	System.out.println(list);
		int newarr[]=new int[list.size()];
		int h=0;
		for(Integer i1:list)
		{
		    newarr[h]=i1;
		    h++;
		}
		System.out.println(Arrays.toString(newarr));
	}
}



