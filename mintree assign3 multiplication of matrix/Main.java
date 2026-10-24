import java.util.*;
public class Main
{
    public static void main(String args[])
    {
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
        int n1=s.nextInt();
        int m1=s.nextInt();
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
               arr2[i][j]=s.nextInt();
            }
        }
        System.out.println();
        int mul[][]=new int[n][m1];
        for(int i=0;i<n;i++){    
              for(int j=0;j<m1;j++){    
                      mul[i][j]=0;      
                      for(int k=0;k<n;k++)      
                         {      
                             mul[i][j]+=arr1[i][k]*arr2[k][j];      
                        }
               System.out.print(mul[i][j]+" ");   
                  }  
         System.out.println(); 
         }    
    }
}
