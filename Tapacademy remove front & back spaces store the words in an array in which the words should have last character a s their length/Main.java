import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //         SAi Sneha Sai Sudha     o/p=>  [sai3,sneha5,sai3,sudha4]   
	 
	 int ind1=0,ind2=0;
	      for(int i=0;i<s1.length();i++)
	      {
	          if(s1.charAt(i)!=' ')
	          {
	              ind1=i;
	              break;
	          }
	      }
	       for(int i=s1.length()-1;i>=0;i--)
	      {
	          if(s1.charAt(i)!=' ')
	          {
	              ind2=i;
	              break;
	          }
	      }
	      String res="";
	       for(int i=ind1;i<=ind2;i++)
	      {
	     res=res+s1.charAt(i);
	      }
	      System.out.println(res);
	      int c=1;
	      for(int i=0;i<res.length()-1;i++)

          {
                 if(res.charAt(i)==' '  && res.charAt(i+1)!=' ')
                    c++;
           }
             System.out.println(c);
             String arr[]=new String[c];
             int k=0;
             String sub="";
             for(int i=0;i<res.length()-1;i++)
             {
                 if(res.charAt(i)!=' ')
                 {
                     sub=sub+res.charAt(i);
                 }
                 else{
                      //System.out.println(sub);
                     if(res.charAt(i)==' ' && res.charAt(i+1) !=' '){
                         sub=sub+sub.length();
                     arr[k]=sub;
                    // System.out.println(k+" "+sub);
                     k++;
                     sub="";
                     }
                 }
             }
             sub=sub+res.charAt(res.length()-1);
             sub=sub+sub.length();
             arr[k]=sub;
             System.out.println(Arrays.toString(arr));
}
}
