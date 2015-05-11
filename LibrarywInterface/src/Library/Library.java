package Library;

import java.util.Scanner;


public class Library {
	static int minCustomers = 100;

	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		do 
		{
		System.out.println("What is the maximum amount of customers you expect?");
		} while (!(Integer.parseInt(tInput.nextLine())>=minCustomers));
		

		
		
	}
	
	private int addCustomer()
	{
		
		
		
		return 0;
	}

}
