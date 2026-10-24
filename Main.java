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
	int x=s.nextInt();
	int arr[]=new int[n];
	int c=0;int y=0;
	int l=0;
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt(); // 11 8 5 7 5 100
	}
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int j=0;j<n;j++)
	{
	    c=j;   //0
	    //int prod=arr[j]; //11
	    int z=j;//0
while(l<n) { //0<6
int prod=arr[j];  //11
       while(y < x-1){   //0<3 1<3 2<3 3!<3
    int c1=c+1;   //3 4
    if(c1<n)  //1<6 2<6 3<6
         prod=prod*arr[c1]; //11*7*5
    y++; //1 2 3
    c++; //  2 3
}
//System.out.println(prod);
if(y==x-1){
list.add(prod);  // 
} 
y=0;
c=z+1; //1 2 
l++;// 1 2
}
	}
	System.out.println(list);
	}
}
