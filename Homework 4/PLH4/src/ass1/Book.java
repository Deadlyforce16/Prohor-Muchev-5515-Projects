package ass1;

public class Book 
{
	String title;
	String author;
	double price;
	int quantity;
	
	public Book(String title,String author,double price,int quantity)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void printAttributes()
	{
		System.out.println("Book title: "+title);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+price);
		System.out.println("Book quantity: "+quantity);
	}
}
