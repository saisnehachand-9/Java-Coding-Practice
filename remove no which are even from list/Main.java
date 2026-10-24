import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);// First Non-Repeating Character
		int n=s.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		    list.add(s.nextInt());
		}
		//System.out.println(list);
		for(int i=0;i<list.size();i++) // 1 2 3 4 5  // 1 3 4 5
		{
		    if(list.get(i)%2==0){
		       list.remove(i);
		       i--;
		      
		    }
		}
		System.out.println(list);// or you can just use iteratot theres no need of using i--
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
		    int var=it.next();
		    if(var % 2 == 0)
		        it.remove();
		}
			System.out.println(list);
	}
}
