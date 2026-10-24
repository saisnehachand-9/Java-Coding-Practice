import java.util.*;
public class Main{
    public static boolean isRowMagic(int[][] arr1,int n,int m)
    {
        boolean b1=true;
        boolean b2=false;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int a=0;a<n;a++)
        {
            int sum=0;
            for(int b=0;b<m;b++)
            {
                sum=sum+arr1[a][b];
            }
            list.add(sum);
        }
        int i=0,c=0; //[3,3,3]
        for(int j=i+1;j<list.size();j++)
        {
            if(list.get(i)==list.get(j))
              c++;
        }
        if(c==list.size()-1)
          return b1;
          else
           return b2;
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
		System.out.println(isRowMagic(arr1,n,m));

}
}


