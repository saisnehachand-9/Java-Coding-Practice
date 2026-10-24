public class Main {
    public static int reverse(int x) {
        String rev="";
        if(x==0)
          return x;
        if(x > 0){
        while(x>0)
        {
            int rem=x%10;
            rev=rev+String.valueOf(rem);
            x=x/10;
        }
        if(rev.length()==10 &&   ((Character.getNumericValue(rev.charAt(0))>2) || (Character.getNumericValue(rev.charAt(rev.length()-1))>7) ) )
        {
            return 0;
        }
            
        else 
           return Integer.valueOf(rev);
                  
    }
        if(x<0)
        {
            String s1=String.valueOf(x);
            String re="-";
            for(int i=s1.length()-1;i>0;i--)
            {
                re=re+s1.charAt(i);
            }
            //rev=rev+re;
            if(  (re.length()==11) &&  ((Character.getNumericValue(re.charAt(1))>2) || (Character.getNumericValue(re.charAt(re.length()-1))>8))){
            return 0;
        }
            else
                rev=rev+re;
        }
             
        return Integer.valueOf(rev);
    }
    public static void main(String args[])
    {
        int x=123;
        System.out.println(reverse(x));
    }
}