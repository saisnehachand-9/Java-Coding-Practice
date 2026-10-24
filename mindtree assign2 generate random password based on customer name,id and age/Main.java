import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter Customer Name");
        String customername=s.nextLine();
         System.out.println("Enter Customer Age");
        int age=s.nextInt();
        s.nextLine();
         System.out.println("Enter CustomerId");
       String customerid=s.nextLine();
       String pwd="";
       for(int i=0;i<3;i++){
       int rno=r.nextInt(customername.length());
         char ch1=customername.charAt(rno);
         pwd=pwd+ch1;
       }
         int rn1=r.nextInt(age);
         pwd=pwd+String.valueOf(rn1);
         for(int i=0;i<4;i++)
         {
             int rn2=r.nextInt(customerid.length());
             char ch2=customerid.charAt(rn2);
             pwd=pwd+ch2;
         }
         System.out.println("RANDOM PASSWORD IS  :"+pwd);
}
}
