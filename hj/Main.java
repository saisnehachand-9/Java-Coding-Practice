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
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int j=0;j<n-1;j++)
	{
	    c=j; //0
      //11
    while(c<n) {//0
int prod=arr[j];
//11
while(y < x-1){ //3
    int c1=c+1; //  2
    if(c1<n) //1<6 2<6 3<6
         prod=prod*arr[c1]; //11*5*7
    y++;//1  2 3
    c++; // 1 2 3
}
if(y==x-1){
list.add(prod);  // 3080
} 
y=0;
c=j+1;  // 1
}
	}
	System.out.println(list);
	}
}
