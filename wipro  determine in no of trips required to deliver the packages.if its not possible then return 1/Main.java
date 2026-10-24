
//There were a large number of orders placed on Amazon Prime Day. The orders are packed and are at the warehouse ready to be delivered. The delivery agent needs to deliver them in as few trips as possible.

//In a single trip, the delivery agent can choose packages following either of two rules:

//• Choose two packages with the same weight

//• Choose three packages with the same weight

//Determine the minimum number of trips required to deliver the packages. If it is not possible to deliver all of them, return -1.

//Example

//weights = [2, 4, 6, 6, 4, 2, 4]

//The agent needs a minimum of 3 trips as shown below. Return 3 as the answer.
import java.util.*;
public class Main
{
    public static int getmin(List<Integer> weights)
    {
        int res=0;
        Collections.sort(weights);
        for(int i=0;i<weights.size();i++)
        {
            int c=1;
            for(int j=i+1;j<weights.size();j++)
            {
                if(weights.get(i)==weights.get(j))
                c++;
            }
            if(c==2 || c==3)
               res++;
           else{
                   res=-1;
                   break;
               }
               i=i+c-1;
     }
     return res;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
		    list.add(s.nextInt());
		}
	System.out.println(getmin(list));	
	}
}
