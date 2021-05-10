package GamerApp.entities.concretes;

public class Game {

	private int id;
	private int categoryId;
	private String gameName;
	private String description;
	private double unitPrice;
	
	public Game(int id, int categoryId, String gameName, String description, double unitPrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.gameName = gameName;
		this.description = description;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
