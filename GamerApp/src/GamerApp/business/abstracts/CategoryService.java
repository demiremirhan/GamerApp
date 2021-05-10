package GamerApp.business.abstracts;

import java.util.List;

import GamerApp.entities.concretes.Category;

public interface CategoryService {

	public void add(Category category);
	public void delete (Category category);
	public void update(Category category);
	public Category getById(int id);
	public List<Category> getAll();
}
