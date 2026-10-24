/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int ArrayChallenge(int[] arr){
    Arrays.sort(arr);
    int c=0;
    int sum=0;
    int h=arr.length-1;
    int n=arr.length;  
    if(n>=4)
    {
        while(c < 4)
        {
            sum=sum+arr[h];
            c++;
            h--;
        }
        
    }
    else
    {
        for(int j=0;j<arr.length;j++)
        {
            sum=sum+arr[j];
        }
    }
    return sum;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int Arr[]=new int[m];
		String challenge="rdv68fxlze9";
		for(int i=0;i<m;i++)
		{
		    Arr[i]=s.nextInt();
		}
		int res=ArrayChallenge(Arr);
		String s1=String.valueOf(res);
		String f1=s1+challenge;
		
StringBuilder sb=new StringBuilder(f1);
for(int a=0;a<f1.length();a++)
{
    int b=a+1;
    if((b) % 4 ==0)
    {
        sb.setCharAt(a,'_');
        }
    
}
System.out.println(res);
System.out.println(sb);
	}
}

