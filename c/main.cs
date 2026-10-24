
using System;
class A 
{
    public static void Main(String[] args)
    {
         Console.WriteLine("Enter the user name");
        String s1=Console.ReadLine();
        Console.WriteLine("name is"+" "+s1);
        Console.WriteLine("Enter the age");
        int age=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("age is"+" "+age);
    }
}