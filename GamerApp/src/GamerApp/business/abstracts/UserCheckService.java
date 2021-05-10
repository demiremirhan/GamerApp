package GamerApp.business.abstracts;

import GamerApp.entities.concretes.User;

public interface UserCheckService {

	public boolean checkIfRealPerson(User user);
}
