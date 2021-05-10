package GamerApp.business.abstracts;

import java.util.List;

import GamerApp.entities.concretes.Order;

public interface OrderService {

	public void add(Order order);
	public void delete(Order order);
	public void update(Order order);
	public Order getById(int id);
	public List<Order> getAll();
}
