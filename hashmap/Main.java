/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args) {
	HashMap<Integer,String> map1=new HashMap<Integer,String>();
map1.put(1,"sneha");
map1.put(2,"sony");
map1.put(3,"shiny");
map1.put(4,"sudha");
System.out.print(map1);
Set<Integer> s1=map1.keySet();
Collection<String> s2=map1.values();
System.out.println(s1);
System.out.println(s2);
for(Integer i:map1.keySet())
{
    System.out.print(i+" "+map1.get(i)+" ");
}
for(String s:map1.values())
{
    System.out.print(s+" ");
}
List<Entry<Integer,String>> list1=map1.entrySet().stream().collect(Collectors.toList());
 //List<Entry<Intger,String>> list1=map1.entrySet().stream.collect(Collectors.toList());
System.out.print(list1);
	}
}
