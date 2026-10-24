import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//"listen", "silent"
	      String s1=s.nextLine();
	      String s2=s.nextLine();
	      char arr1[]=s1.replaceAll("\\s","").toLowerCase().toCharArray();
	       char arr2[]=s2.replaceAll("\\s","").toLowerCase().toCharArray();
	      System.out.println(Arrays.toString(arr1));
	      System.out.println(Arrays.toString(arr2));
	      if(arr1.length==arr2.length)
	         {
	             HashMap<Character,Integer> map1=new HashMap<>();
	             for(int i=0;i<arr1.length;i++)
	             {
	                 map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
	             }
	             
	          //   System.out.println(map1);
	             for(int i=0;i<arr2.length;i++)
	             {
	                 char ch=arr2[i]; //s
	                 if(!map1.containsKey(ch))
	                 {
	                     System.out.println("they are not anagrams");
	                     return;
	                 }
	                     map1.put(arr2[i],map1.get(arr2[i])-1);
	                 if(map1.get(ch)==0)
	                    map1.remove(ch);
	             }
	             //System.out.println(map1);
	            if(map1.isEmpty())
	             System.out.println("they are anagrams");
	             else
		        System.out.println("they are not anagrams");
	         }
	         else
		        System.out.println("they are not anagrams");
	}
}
