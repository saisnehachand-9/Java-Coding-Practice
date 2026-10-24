import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int arr[]={1,2,3,4,5,6};

    Stack<Integer> st=new Stack<Integer>();
    for(int i=0;i<arr.length;i++)
    {
        st.push(arr[i]);
    }
       System.out.println(st);
       System.out.println(st.indexOf(5));
       int stacksize=st.size();
       int middle=(0+stacksize)/2;
        System.out.println(st.indexOf(5));
         System.out.println(st.get(middle));
         Stack<Integer> newstack=new Stack<Integer>();
        for(int i=0;i<st.size();i++)
        {
            if(st.get(i)<st.get(middle))
                 newstack.add(st.get(i));
        }
        System.out.println(newstack);
	}

}
