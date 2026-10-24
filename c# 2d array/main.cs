using System;
class A 
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Enter the row size of array");
        int row=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter the col size of array");
        int col=Convert.ToInt32(Console.ReadLine());
        string[,] arr=new string[row,col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i,j]=Console.ReadLine();
            }
        }
     foreach (string i in arr)
            {
                Console.Write(i + " ");
            }
            Console.WriteLine("\n");
    }
}