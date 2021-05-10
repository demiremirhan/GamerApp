package GamerApp.business.concretes;

import java.util.List;

import GamerApp.business.abstracts.CategoryService;
import GamerApp.entities.concretes.Category;


public class CategoryManager implements CategoryService{

	@Override
	public void add(Category category) {
		System.out.println("added category : "+ category.getCategoryName() );
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("deleted category : "+ category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("updated category : " + category.getCategoryName());
		
	}

	@Override
	public Category getById(int id) {
		System.out.println("get by id category");
		return null;
	}

	@Override
	public List<Category> getAll() {
		System.out.println("get all category");
		return null;
	}

}
