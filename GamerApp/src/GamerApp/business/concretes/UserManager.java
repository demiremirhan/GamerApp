package GamerApp.business.concretes;

import java.util.List;

import GamerApp.business.abstracts.UserCheckService;
import GamerApp.business.abstracts.UserService;
import GamerApp.entities.concretes.User;

public class UserManager implements UserService {

	private UserCheckService userCheckService;
	
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			System.out.println("correct add");
		}else {
			System.out.println("check your data !!!");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("deleted user  " + user.getFirstName() +" "+ user.getLastName() ) ;
		
	}

	@Override
	public void update(User user) {
		System.out.println("updated user  " + user.getFirstName() +" "+ user.getLastName() ) ;
		
	}

	@Override
	public User getById(int id) {
		System.out.println("get by id  ") ;
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("get all users");
		return null;
	}

	
}
