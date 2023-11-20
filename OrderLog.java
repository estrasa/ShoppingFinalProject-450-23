package depaul.edu;
import java.util.*;

class OrderLog implements OrderManager{

	private ArrayList<Order> log = new ArrayList<Order>();
	
	@Override
	public void PlaceOrder(Cart cart, OrderLog log) {
		Order order = new Order();
		for(Product p : cart.contents) {
			order.items.concat(p.name + "    $"+ p.price);
			cart.remove(p);
		}
		log.log.add(order);
		cart.user.saveOrder(order);
	}



	@Override
	public void AccessLog() {
		for(Order d : log) {
			System.out.println(d.orderDetails());
			
		}
		
	}
	

}
