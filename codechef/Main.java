import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int b=0;b<a;b++){
		    int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt(); //5 15 7 19 8
		}
		Arrays.sort(arr);
		ArrayList<Integer> list=new ArrayList<Integer>(); //2 3 5 7 11 13 15
		int h=arr[arr.length-1];
		for(int j=2;j<=h;j++)
		{
		    int c=0;
		    for(int k=1;k<=j;k++)
		    {
		        if(j%k==0)
		        c++;
		    }
		    if(c==2)
		        list.add(j);
		}
		for(int m=0;m<list.size();m++)
		{
		    int c1=0;
		    	for(int l=0;l<n;l++)
		        {
		           if(arr[l] % list.get(m)!=0)
		              c1++;
	         	}
	         	if(c1==n)
	         	{
	         	    System.out.println(list.get(m));
	         	    break;
	         	}
		}
		}
	}
}
