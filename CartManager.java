package depaul.edu;

interface CartManager {

	void add(Product product);
	
	void remove(Product product); 
	
	public double total();
	
	public void display();
}
