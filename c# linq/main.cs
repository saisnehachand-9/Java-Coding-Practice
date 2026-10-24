using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
	
namespace Hello
{
    internal class Program
    {
        
        static void Main(string[] args)
        {
            List<Person> list = new List<Person>
            {
                new Person{Id=100,FisrtName="sai",LastName="sudha",Age=22 },
                new Person{Id=101,FisrtName="sai",LastName="sneha",Age=21},
                new Person{Id=102, FisrtName="sony",LastName ="vana",Age=19},
                new Person{Id=103,FisrtName="shiny",LastName="chand",Age=25}
            };

            var c=from j in list select j;
            foreach (var p in c)
            {
                Console.WriteLine("ID : {0} FIRST NAME : {1} LAST NAME : {2} AGE : {3}", p.Id, p.FisrtName, p.LastName, p.Age);
            }
            Console.ReadLine();  
            
        }
    }
}
public class Person
{
    public int Id { get; set; }
    public string FisrtName { get; set; }
    public string LastName { get; set; }    

    public int Age { get; set; }
}
