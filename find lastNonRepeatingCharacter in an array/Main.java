import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //aabccde
	    int frequency[]=new int[256];
	    for(int i=0;i<s1.length();i++)
	    {
	        int index=s1.charAt(i);
	        frequency[index]+=1;
	    }
	   // System.out.println(Arrays.toString(frequency));
	    char lastNonRepeated=0;
	    boolean found=false;
	    for(int j=0;j<s1.length();j++)
	    {
	        int index=s1.charAt(j);
	        if(frequency[index]==1)
	        {
	            //System.out.println(s1.charAt(j));
	            lastNonRepeated=s1.charAt(j);
	            found=true;
	        }
	    }
	    if(!found)
		System.out.println("not found");
		else
			System.out.println(lastNonRepeated);
	}
}
