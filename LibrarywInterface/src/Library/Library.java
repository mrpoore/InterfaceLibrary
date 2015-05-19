package Library;

import java.util.Scanner;


public class Library {
	static int minCustomers = 100;
    static Book[] books = new Book[10];
	static int answer = 0;
    
	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//Add the books
		addBooks();
		
		do
		{
			System.out.println("What would you like to do?");
			System.out.println("1 display books");
			System.out.println("2 checkout a book");
			System.out.println("3 checkin a book");
			System.out.println("4 add a customer");
		}while (answer == 0);
		
		
	}
	
	private static int addCustomer()
	{
		
		
		
		return 0;
	} 
	
	private static void addBooks()
	{
		for (int i = 0; i < books.length; i++ )
		{
			books[i] = new Book();
			System.out.println("Enter a book name");
			books[i].setTitle(tInput.nextLine());
			System.out.println("the Author?");
			books[i].setAuthor(tInput.nextLine());
			
		}
		

	}
	
	private static void displayBooks()
	{
		for (int i = 0; i < books.length; i++ )
		{
			System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor());
		}
		

	}

}
