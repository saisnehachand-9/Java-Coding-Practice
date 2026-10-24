/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface A{
        void results(int a,int b,int c); 
}
 public class Main implements A{
    public void results(int a,int b,int c)
    {
        System.out.println("Total marks got for UNIX is : "+a);
         System.out.println("Total marks got for OS is : "+b);
          System.out.println("Total marks got for MEFA is : "+c);
    }
    	public static void main(String[] args) {
		Main b=new Main();
		b.results(85,75,80);
}

}
