package GamerApp.business.concretes;

import java.util.List;

import GamerApp.business.abstracts.GameService;
import GamerApp.entities.concretes.Game;

public class GameManager  implements GameService {
	@Override
	public void add(Game game) {
		System.out.println("added game  " + game.getGameName() ) ;
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("deleted game  " + game.getGameName() ) ;
		
	}

	@Override
	public void update(Game game) {
		System.out.println("updated game  " + game.getGameName() ) ;
		
	}

	@Override
	public Game getById(int id) {
		System.out.println("get by id  "  ) ;
		return null;
	}

	@Override
	public List<Game> getAll() {
		System.out.println("get all game");
		return null;
	}

	
}
