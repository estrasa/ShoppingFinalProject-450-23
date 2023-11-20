package depaul.edu;

class Order {
	
	User user;
	int OID; //order id #
	
	private String name = user.getName();
	private String address = user.getAddress();
	
	String items;
	
	public String orderDetails() {
		return("Order #" + OID + "\n\n" 
				+ name + "\n" + address +"\n"
					+"\n" + items);
	}
	
}
