package GamerApp.business.abstracts;

import java.util.List;

import GamerApp.entities.concretes.Game;

public interface GameService {

	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);
	public Game getById(int id);
	public List<Game> getAll();
}
