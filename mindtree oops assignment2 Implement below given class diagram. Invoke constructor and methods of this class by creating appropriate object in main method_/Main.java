import java.util.*;
class Main{
    double balance;
    int interestRate;
    int accountNo;
    Main(){
        
    }
    Main(double balance,int interestRate,int accountNo)
    {
        this.balance=balance;
        this.interestRate=interestRate;
        this.accountNo=accountNo;
    }
    void withdraw(double amount)
    {
        if(amount > balance)
                 System.out.println("Insufficient Amount");
                 else
                  System.out.println("Successfully Withdrawn "+amount);
    }
    void calculateInterest(){
        int time=3;
        int ptr=(int)(balance*interestRate*time)/100;
        System.out.println("Simple Interest is :"+ptr);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter balance");
        double b=s.nextDouble();
        System.out.println("Enter interestrate");
        int i=s.nextInt();
        System.out.println("Enter accountno");
        int a=s.nextInt();
       Main sa=new Main(b,i,a);
        System.out.println("Enter amount to withdraw");
        double d=s.nextDouble();
        sa.withdraw(d);
        sa.calculateInterest();
    
        
    }
}