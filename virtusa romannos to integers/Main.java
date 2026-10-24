import java.util.*;
public class Main
{
    int check(char ch)
    {
        if(ch=='M')
          return 1000;
          if(ch=='D')
           return 500;
          if(ch=='C')
           return 100;
          if(ch=='L')
            return 50;
          if(ch=='X')
           return 10;
          if(ch=='V')
           return 5;
          if(ch=='I')
            return 1;
            return -1;
    }
    void romanno(String st){
        int res=0;
        for(int i=0;i<st.length();i++)
        {
            int s1=check(st.charAt(i));
              if((i+1)<st.length()) {
                 int s2=check(st.charAt(i+1));
                 if(s1>=s2)
                   {
                       res=res+s1;
                   }
                   else{
                       res=res+s2-s1;
                       i++;
                   }
              }
              else{
               res=res+s1;
              }
        }
    System.out.println(res);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String x=s.nextLine();
		Main m=new Main();
		m.romanno(x);
	}
}
