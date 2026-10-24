import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
int len=n-i-1;
int c=0;
for(int j=i+1;j<n;j++)
{
if(arr[i]>arr[j])
c++;
}
if(c==len)
   System.out.println(arr[i]);
}
}
}