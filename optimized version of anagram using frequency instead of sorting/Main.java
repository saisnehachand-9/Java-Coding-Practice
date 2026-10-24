import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //hello master
	    String s2=s.nextLine();
	     s1=s1.replaceAll("\\s","").toLowerCase();
	     s2=s2.replaceAll("\\s","").toLowerCase();
	    if(s1.length()!=s2.length())
	    {
	        System.out.println("not anagrams");
	        return;
	    }
	    else{
	        int[] frequency=new int[26];
	        for(int i=0;i<s1.length();i++)
	        {
	            int index=s1.charAt(i)-'a';
	            frequency[index]+=1;
	        }
	        for(int j=0;j<s2.length();j++)
	        {
	            int index=s2.charAt(j)-'a';
	            frequency[index]-=1;
	        }
	        int c=0;          // or you can write this way /// boolean anagram=true;
	        for(int i=0;i<frequency.length;i++){         // for(int j:frequemcy){
	            if(frequency[i]!=0){                     //  if(j!=0){
	                c++;                                 //      anagram=false;
	                break;                                //       break; }}
	            }                                          
	        } 
	        if(c==0)                                    //if(anagram) s.o.p(anagram);
	           System.out.println("Anagram");    
	           else
	           System.out.println("not anagram");
	    }
		//System.out.println("Hello World");
	}
}
