package GamerApp.entities.concretes;

import java.time.LocalDate;

public class Order {

	private int id;
	private int userId;
	private int gameId;
	private String userName;
	private String userLastName;
	private double price;
	private LocalDate orderDate;
	
	public Order(int id, int userId, int gameId, String userName, String userLastName, double price,
			LocalDate orderDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.userName = userName;
		this.userLastName = userLastName;
		this.price = price;
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
}
