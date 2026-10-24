/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int newarr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		    int mul=1;
		    for(int l=0;l<n;l++) // 1 2 3 4 5
		    {
		        if(l!=j)
		        {
		            mul=mul*arr[l];
		        }
		    }
		    newarr[j]=mul;
		}
		    System.out.print(Arrays.toString(newarr));
		}
}
