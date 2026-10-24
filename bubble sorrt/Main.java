/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)
        {
            int k=j+1;
            if(arr[j]>arr[k])
            {
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
        }
    }
     System.out.println(Arrays.toString(arr));
}
}
