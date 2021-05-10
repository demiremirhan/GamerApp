package GamerApp.business.concretes;

import java.util.List;

import GamerApp.business.abstracts.OrderService;
import GamerApp.entities.concretes.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println("added order  " +order.getGameId() +" "+
											order.getOrderDate()+" "+
											order.getUserName()) ;
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("deleted order  "  ) ;
		
	}

	@Override
	public void update(Order order) {
		System.out.println("updated order  "  ) ;
	}

	@Override
	public Order getById(int id) {
		System.out.println("get by id  order"  ) ;
		return null;
	}

	@Override
	public List<Order> getAll() {
		System.out.println("get all orders  "  ) ;
		return null;
	}

	
}
