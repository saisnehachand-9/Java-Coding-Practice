/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int findNum(int arr[])
    {
        int c=0;
        if(arr.length==2){
            Arrays.sort(arr);
       if(arr[0]*arr[0]==arr[1])
         c++;
        else
             c--;
        }
        else
          c=-1;
        return c;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Arr[]=new int[n];
		for(int a=0;a<n;a++)
		{
		    Arr[a]=s.nextInt();
		}
		int resu=findNum(Arr);
		System.out.println(resu);
	}
}
