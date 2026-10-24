import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
	    list.add("sneha");
	    list.add("sudha");
	    list.add("vikku");
	    list.add("shiny");
	    for(String s1:list)
	    {
	        System.out.println(s1);
	    }
	     System.out.println(list.get(2));
	     list.set(3,"bondaelephant");
	     System.out.println(list);
	    // list.set(1,"saisnehachand");
	     System.out.println(list.size());
	     list.add("kuchu puchu");
	      System.out.println(list);
	      list.remove(list.size()-1);
	      System.out.println(list);
	     String arr[]=list.toArray(new String[0]);
	           System.out.println(Arrays.toString(arr));
	          System.out.println(list.contains("vikku"));
	          
	          ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	         Collections.sort(list2);
	          System.out.println("in ascending order: "+list2);
	           ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(3,4,5,30, 40, 50,3,5));
	           Collections.sort(list3,Collections.reverseOrder());
	           System.out.println("in descending order: "+list3);
	            list2.addAll(list3);
	         System.out.println(list2);
	         list2.removeAll(list3);
	          
	           System.out.println(list2);
	           list3.removeAll(list2);
	           System.out.println(list3);
	           System.out.println("finding 1st occurence of 5 in list3 :"+list3.indexOf(5));
	            System.out.println("finding last occurence of 5 in list3 :"+list3.lastIndexOf(5));
	           int count=0;int check=5;
	           for(int i=0;i<list3.size();i++)
	           {
	               if(list3.get(i)==check)
	                   count++;
	           }
	           System.out.println("count of 5 :"+count);
	}
}
