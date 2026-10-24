import java.util.*;
class Book
 {
	  String Author;
	  String Title;
	double Price;
	int PYear;
	
	public Book(String author, String title, double price, int pYear) {
		Author = author;
		Title = title;
		Price = price;
		PYear = pYear;
	}  
}
public class Main {

	public static void main(String[] args) {
		
    Book B1= new Book("	Alfredo Covelli ", " Vahana Masterclass ", 19.50, 2020);
    Book B2= new Book("R. Kaushik", " India’s 71-Year Test: The Journey to Triumph in Australia ", 20.90, 1902);
    Book B3= new Book("	R. Giridharan", " Right Under Our Nose ", 9.50, 1986);

System.out.println("Author"+" |"+"Title"+" |"+"Price"+" |"+"Published Year");
	System.out.println(B1.Author+" |"+B1.Title+" |"+B1.Price+" |"+B1.PYear);
	System.out.println(B2.Author+" |"+B2.Title+" |"+B2.Price+" |"+B2.PYear);
	System.out.println(B3.Author+" |"+B3.Title+" |"+B3.Price+" |"+B3.PYear);
	}
}
