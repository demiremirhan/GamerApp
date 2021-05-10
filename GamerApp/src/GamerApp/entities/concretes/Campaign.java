package GamerApp.entities.concretes;

public class Campaign {

	private int id;
	private String campaignName;
	private String description;
	private double discount;
	
	public Campaign(int id, String campaignName, String description, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.description = description;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
