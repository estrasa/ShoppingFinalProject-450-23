package depaul.edu;

import java.util.Scanner;

public class IOAndMenuManager {

	boolean signedIn = false; 
	
	public Scanner scan;
	
	public Scanner getInStream(){
		return new Scanner(System.in);
		}
	
	public void WelcomeMenu() {
		System.out.println("Welcome to Sara's Store!");
		System.out.println("Select an option from the menu below:");
		System.out.println("1  View Catalog as guest");
		System.out.println("2  Sign in to shop!");
	}
	
	public void ProductMenu(Product product) {
		System.out.println(product.name + "\n"+ product.description);
		System.out.println("Select an option from the menu below:");
		System.out.println("1  Add to cart");
		System.out.println("2  Back to catalog");
	}
	
	public void CartMenu(Cart cart) {
		cart.display();
		System.out.println("Select an option from the menu below:");
		System.out.println("1  Check out");
		System.out.println("2  Remove an item");
		System.out.println("3  View previous orders");
		System.out.println("4  Back to catalog");
		System.out.println("5  Sign out");
	}
	
	public void exit() {
		
	}
	
}
