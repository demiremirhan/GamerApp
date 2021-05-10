package GamerApp;

import java.time.LocalDate;
import GamerApp.business.concretes.CampaignManager;
import GamerApp.business.concretes.CategoryManager;
import GamerApp.business.concretes.GameManager;
import GamerApp.business.concretes.OrderManager;
import GamerApp.business.concretes.UserManager;
import GamerApp.core.adapter.MernisServiceAdapter;
import GamerApp.entities.concretes.Campaign;
import GamerApp.entities.concretes.Category;
import GamerApp.entities.concretes.Game;
import GamerApp.entities.concretes.Order;
import GamerApp.entities.concretes.User;


public class Main {

	public static void main(String[] args) throws Exception {
		Campaign campaign = new Campaign(1, "forKids", "this summer",0.25);
		Category category = new Category(1, "war", "+15 for play");
		Game game =new  Game(1, 1, "Call of Buddy", " fun day for play", 29.99);
		Order order = new Order(1, 1, 1, "emirhan", "demir", 29.99, LocalDate.now());
		User user = new User(
				1, 
				"12345678945", 
				"emirhan", "demir", 
				"emirhandemir@aol.com", 
				LocalDate.of(1962, 9, 10));
		
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		CategoryManager categoryManager = new CategoryManager();
		
		categoryManager.add(category);
		categoryManager.delete(category);
		categoryManager.update(category);
		
		GameManager gameManager = new GameManager();
		
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		OrderManager orderManager = new OrderManager();
		
		orderManager.add(order);
		orderManager.delete(order);
		orderManager.update(order);
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);

	}

}


