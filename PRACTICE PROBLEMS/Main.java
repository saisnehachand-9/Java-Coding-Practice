import java.util.*;
public class Main
{
    public static boolean isPalindrome(String s1)
    {
     int i=0;int j=s1.length()-1;
     while(i<j)
     {
       if(s1.charAt(i)!=s1.charAt(j))  
          return false;
          else
          {
           i++;
           j--;
          }
     }
    return true;
    }
     
     public static void printFibonacci(int x)
     {
         int i=0,j=1;
         System.out.print(i+","+j);
         int c=x-2;
         while(c>0){
         int sum=i+j;//1
         System.out.print(","+sum);
         i=j;
         j=sum;
         c--;
         }
     }
 
  public static void isPrime(int x)
     {
         int c=0;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                c++;
                break;
            }
        }
        if(c==0)
          System.out.println("prime");
          else
           System.out.println("not a prime");
     }
      public static void commonFactorsOf2Num(int x,int y) //10 ,20
     {
         
         int z;
         if(x<y)
           z=x;
           else
           z=y;
        for(int i=1;i<=z;i++)    // 10 -> 1 2 5 10  // 20-> 1 2 4 5 10 20
        {
            if(x%i==0 && y % i ==0 )
            {
               System.out.println(i);
            }
        }
       
     }
 
 public static void lowestCommonFactorsOf2Num(int x,int y) //10 ,20
     {
         
         int z;
         if(x<y)
           z=x;
           else
           z=y;
        for(int i=1;i<=z;i++)    // 10 -> 1 2 5 10  // 20-> 1 2 4 5 10 20
        {
            if(x%i==0 && y % i ==0 )
            {
               System.out.println(i);
               break;
            }
        }
     }
        public static void LongestCommonFactorsOf2Num(int x,int y) //10 ,20
     {
         
         int z;
         if(x<y)
           z=x;
           else
           z=y;
        for(int i=z;i>=1;i--)    // 10 -> 1 2 5 10  // 20-> 1 2 4 5 10 20
        {
            if(x%i==0 && y % i ==0 )
            {
               System.out.println(i);
               return;
            }
        }
       
     }
        
     
         public static void lowestCommonFactorsOf2NumExcluding1AND2(int x,int y) //10 ,20
     {
         
         int z;
         if(x<y)
           z=x;
           else
           z=y;
        for(int i=3;i<=z;i++)    // 10 -> 1 2 5 10  // 20-> 1 2 4 5 10 20
        {
            if(x%i==0 && y % i ==0  )
            {
               System.out.println(i);
               return;
            }
        }
       
     }
     
     
         public static void LCMof2NUM(int x,int y) //10 ,20
     {
         int i=1;
         while(i>=1)
         {
             int a=x*i;//10
             if(a % x ==0 && a % y == 0)
             {
                 System.out.println(a);
                 break;
             }
             i++;
         }
         
     }
     
     public static void sumOfNnaturalNos(int n) //10 ,20
     {
        int x=n*(n+1);
		System.out.println(x/2);
 
         
     }
      public static void commonMultipleOf2Nos(int n,int x) //10 ,20
     {
      System.out.print("Common Multiples of "+n +" & "+x+" are : ");
      int z;
      if(n > x)
        z=n;
        else
        z=x;
		 for(int i=1;i<=20;i++)
		 {
		     int n1=z*i;
		   
		   if(n1 % n ==0 && n1 % x ==0)
		     
		         System.out.print(n1+" ");
		 }
     }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
      	//String s1=s.nextLine();  //MALAYALAM PPPP      //palindrome
      	   // boolean b=isPalindrome(s1);
      	  //  System.out.println(b);
      	  
      //	  int x=s.nextInt();                          //fibonacci
      //	  printFibonacci(x);
        
       // int x=s.nextInt();                               //prime
       //    isPrime(x);
       
      // int x=s.nextInt();                             //CommonFactorsOf 2 Numbers
      // int y=s.nextInt();
      // commonFactorsOf2Num(x,y);
      
     // int x=s.nextInt();                                   //LowestCommonFactorsOf 2 Numbers
     // int y=s.nextInt();
     // lowestCommonFactorsOf2Num(x,y);
     
    //  int x=s.nextInt();                                   //LongestCommonFactorsOf 2 Numbers
    //   int y=s.nextInt();
     //  LongestCommonFactorsOf2Num(x,y);
     
     
     //  int x=s.nextInt();                                   //lowestCommonFactorsOf2NumExcluding1AND2
   // int y=s.nextInt();
   // lowestCommonFactorsOf2NumExcluding1AND2(x,y);
   
  // int x=s.nextInt(); 
  // int y=s.nextInt(); 
  //  LCMof2NUM(x,y);
    
  //   int y=s.nextInt();                                   //sumOfNnaturalNos
  //  sumOfNnaturalNos( n);
  
 // int x=s.nextInt();                                      //commonMultipleOf2Nos
  //int y=s.nextInt();
  //commonMultipleOf2Nos(x,y);
  
   int x=s.nextInt(); 
  int y=s.nextInt();
  commonMultipleOf2Nos(x,y);
	}
}
