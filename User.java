package depaul.edu;

import java.util.ArrayList;

class User {

	private String username;
	private String password;
	
	private String name;
	private String address; 
	
	private static Cart cart;
	
	private ArrayList<Order> orderHistory;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	// No setUsername 

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void saveOrder(Order order) {
		orderHistory.add(order);
	}
	
}
