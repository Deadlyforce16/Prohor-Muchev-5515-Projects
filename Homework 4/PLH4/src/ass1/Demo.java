package ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;  

public class Demo 
{
	public static void main(String[] args) 
	{
		List<Book> books=new ArrayList<>();
		
		Book book1=new Book("In Search of Lost Time","Marcel Proust",10.5,500);
		Book book2=new Book("Ulysses","James Joyce",15.0,1000);
		Book book3=new Book("Don Quixote","Miguel de Cervantes",20.0,1500);
		Book book4=new Book("The Great Gatsby","F. Scott Fitzgerald",12.5,800);
		Book book5=new Book("Moby Dick","Herman Melville",18.5,1200);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		System.out.println("All books:");
		System.out.println();
		for(Book b:books)
		{
			b.printAttributes();
			System.out.println();
		}
		
		List<Book> orderedBooks=books.stream().sorted((b1,b2)->b1.title.compareTo(b2.title)).collect(Collectors.toList());
		System.out.println("Books ordered by title:");
		System.out.println();
		for(Book b:orderedBooks)
		{
			b.printAttributes();
			System.out.println();
		}
		
		Book mostExpensiveBook=books.stream().max(Comparator.comparingDouble(book->book.price)).orElse(null);
		System.out.print("The most expensive book is: ");
		System.out.println(mostExpensiveBook!=null ? mostExpensiveBook.title : "No such book.");
		
		Book cheapestBook=books.stream().min(Comparator.comparingDouble(book->book.price)).orElse(null);
		System.out.print("The cheapest book is: ");
		System.out.println(cheapestBook!=null ? cheapestBook.title : "No such book.");
		
		boolean atleastOneBook=books.stream().anyMatch(book->book.quantity>1000);
		System.out.println("Is there atleast one book with a quantity over 1000 in stock? "+atleastOneBook);
	}
}
