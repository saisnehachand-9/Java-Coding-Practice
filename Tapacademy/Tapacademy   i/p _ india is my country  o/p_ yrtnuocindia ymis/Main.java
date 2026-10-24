import java.util.*;
public class Main
{
    public static String reverse(String x)
    {
        String rev="";
        for(int i=x.length()-1;i>=0;i--)
        {
            rev=rev+x.charAt(i);
        }
        return rev;
    }
    
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in); 
	    String s1=s.nextLine(); //hello sai sneha chand
	    int c=1;
	    String res="";
	    String sub="";
	     for(int i=0;i<s1.length();i++)
	     {
	         if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
	         {
	            c++;
	         }
	     }
	    String arr[]=new String[c];
	    int k=0;
	     for(int i=0;i<s1.length();i++)
	     {
	         if(s1.charAt(i)!=' ')
	         {
	             sub=sub+s1.charAt(i);
	         }
	         else{
	             if(sub.length()>0)
	             {
	                 arr[k]=sub;
	                 sub="";
	                 k++;
	             }
	         }
	     }
	     arr[k]=sub;
	     System.out.println(Arrays.toString(arr));  //  i/p : india is my country  o/p: yrtnuocindia ymis
	       
	       int i=arr.length-1,j=0;
	       while(i>j)
	       {
	           
	           System.out.print(reverse(arr[i])+arr[j]+" ");
	           i--;
	           j++;
	       }
	
	}
}
