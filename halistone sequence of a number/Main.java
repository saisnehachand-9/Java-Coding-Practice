
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//14
        int c=0;
        while(n>1)
        {
            if( n % 2 == 0){
                  System.out.println(n+" is even so i take half :"+(n/2));
                  n=n/2;
            }
            else{
              System.out.println(n+" is odd so i make 3n+1:"+(3*n+1));
              n=3*n+1;
             }
             c++;
        }
        System.out.println("There are total "+c +" steps to reach 1");
    }
}

