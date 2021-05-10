package GamerApp.business.abstracts;

import java.util.List;

import GamerApp.entities.concretes.User;

public interface UserService {

	public void add(User user);
	public void delete(User user);
	public void update(User user);
	public User getById(int id);
	public List<User> getAll();
}
