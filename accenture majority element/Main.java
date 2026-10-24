
import java.util.*;
public class Main
{
    public static  int majority(int input1,int[] input2)
    {
       // Arrays.sort(input2);  // 1 1 2
        for(int i=0;i<input2.length;i++)
        {
            int c=0;
            for(int j=0;j<input2.length;j++)
            {
                if(input2[i]==input2[j])
                   c++;
            }
            if(c>input2.length/2)
            {
                return input2[i];
                
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	Scanner s=new  Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	System.out.println(majority(n,arr));
	}
}
