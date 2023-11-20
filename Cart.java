package depaul.edu;

import java.util.ArrayList;

public class Cart implements CartManager{

	public static final double TAX = .10;
	
	ArrayList<Product> contents = new ArrayList<Product>();
	
	User user;
	
	double subtotal = 0;
	
	private Cart() {
		
	}

	@Override
	public void add(Product product) {
		contents.add(product);
		subtotal += product.price;
	}

	@Override
	public void remove(Product product) {
		contents.remove(product);
		subtotal -= product.price;
	}

	@Override
	public double total() {
		return subtotal*(1+TAX) ;
	}

	@Override
	public void display() {
		System.out.println("Shopping Cart\n");
		for (Product p : contents) {
			System.out.println(p.name);
			System.out.println("$"+p.price);
		}
		
	}
	
}
