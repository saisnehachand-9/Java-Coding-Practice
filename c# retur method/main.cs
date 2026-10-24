using System;
class A 
{
    public int method(int n)
    {
        return n*n;
    }
    public static void Main(string[] args)
    {
        A a=new A();
        Console.WriteLine("Enter the Number");
        int b=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Sqaure of the Number is  "+a.method(b));
    }
}