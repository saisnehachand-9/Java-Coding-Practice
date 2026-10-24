/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        arr[i][j]=s.nextInt();
		    }
		}
		for(int k=0;k<n;k++)
		{
		    System.out.println(Arrays.toString(arr[k]));
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum=0,c=0;
		for(int a=0;a<n;a++)
		{
		    int newarr[]=arr[a];  
		    Arrays.sort(newarr); // 1 2 3, 2 3 3, 1 2 4   ,sum=1+2+1=4,// 2 3 4,4 2 3,1 4 5 ,sum=2+3+1=6
		    int small=newarr[0]; // 2
		    if(a==0){
		    list.add(small); //1
		    sum=sum+small; //1
		    }
		    int len=list.size(); //1
		    int ele=list.get(list.size()-1); //1
		    if(a >0){ //1
		    if(ele !=small){
		        list.add(small);
		        sum=sum+small; //1+2
		    }
		    if((ele == small) && (newarr.length>1))
		    {
		        list.add(newarr[1]);//1 2
		        sum=sum+newarr[1];  //1+2
		        }
		    }
		    
		         
		    
		}
		System.out.println("list is"+list);
			System.out.println("sum is"+sum);
	
	}
}
