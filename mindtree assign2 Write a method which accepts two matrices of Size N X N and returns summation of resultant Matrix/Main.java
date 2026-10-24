import java.util.*;
public class Main
{
    public static int[][] sumofarray(int arr1[][],int arr2[][],int n,int m)
    {
        int c[][]=new int[n][m];
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<m;b++)
            {
                c[a][b]=arr1[a][b]+arr2[a][b];
            }
           
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr1[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        arr1[i][j]=s.nextInt();
		    }
		}
		int arr2[][]=new int[n][m];
	    	for(int a=0;a<n;a++)
		{
		    for(int b=0;b<m;b++)
		    {
		        arr2[a][b]=s.nextInt();
		    }
		}
		System.out.println(Arrays.deepToString(sumofarray(arr1,arr2,n,m)));
	
		
	}
}











