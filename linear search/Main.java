/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int arr[]={1,23,45,67,89,2,54,66};
	int search=20;
	int c=-1;
	for(int i=0;i<arr.length;i++)
	{
	    if(arr[i]==search)
	    {
	        c=i;;
	    }
	    
	}
	if(c>=0)
	   System.out.println("search found at"+" "+c);
	   else
	   System.out.println("search not found at"+" "+c);
	}
}
