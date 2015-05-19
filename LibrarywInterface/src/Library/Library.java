package Library;

import java.util.Scanner;


public class Library {
	static int maxCustomers = 100;
	static int maxBooks = 100;
	static Customer[] customers = new Customer[maxCustomers];
    static Book[] books = new Book[maxBooks];
	static int answer = 0;
    
	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		//Initialize Books
		
		for (int i = 0; i < books.length; i++)
			books[i] = new Book();
		
		//Add the books
		addBooks();
		
		do
		{
			System.out.println("What would you like to do?");
			System.out.println("1 display books");
			System.out.println("2 checkout a book");
			System.out.println("3 checkin a book");
			System.out.println("4 add a customer");
			answer = nInput.nextInt();
			
			if (answer == 1)
				displayBooks();
			else if (answer == 2)
				checkout();
			else if (answer == 3)
				checkin();
			else if (answer == 4)
				addCustomer();
					
		}while (answer != 0);
		
		
	}
	
	private static void addCustomer()
	{
		
	
	} 
	
	private static void checkout()
	{
		
		
	}
	
	private static void checkin()
	{
		
		
	}
	private static void addBooks()
	{
		System.out.println("How many books do you want to enter?");
		int numBooks = nInput.nextInt();
		
		int b = 0;
		
		for (b = 0; b < books.length && !books[b].getTitle().equals(""); b++)
		{
			
		}
		
		
		for (int i = b; i < numBooks+b && i < maxBooks; i++ )
		{
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
