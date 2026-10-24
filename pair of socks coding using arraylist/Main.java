import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	ArrayList<Integer> list=new ArrayList<Integer>();
	int p=0;
	for(int i=0;i<n;i++)
	{
	   list.add(s.nextInt());
	}
    Collections.sort(list);
	for(int i=0;i<n-1;i++)
	{
	    int c=0,store=i;
	    for(int j=i+1;j<n;j++)
	    {
	        if(list.get(i)==list.get(j))
	        {
	            c++;
	            store=j;
	        }
	    }
	    if(i!=list.size()-1){
	    if(c==1)
                p=p+c;
       else if(c % 2 != 0 )
           p=p+c-1;
        else{
            int x=c/2;
           p=p+x;
        }
	    }
	   i=store;
	}
	System.out.println(p);
	}
}
