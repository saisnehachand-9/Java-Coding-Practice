
import java.util.*;
public class Main
{
    public static int calclength(int n,int m,int k)
    {
        String s1=String.valueOf(n); //86
		for(int i=0;i<m;i++)
		{
		      String rev="";
		    for(int j=0;j<s1.length();j++)
		    {
		        int x=Character.getNumericValue(s1.charAt(j)); //8
		        int y=x+k;
		        rev=rev+String.valueOf(y);
		        
		    }
		    s1=rev;
		    
		}
	return s1.length();
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int repeat=s.nextInt(); //2
		int c=0;
		while(c < repeat){
		int N=s.nextInt(); // 86
		int M=s.nextInt();   // 3
		int K=s.nextInt(); 
		System.out.println(calclength(N,M,K));
		c++;
		}
	}
}
