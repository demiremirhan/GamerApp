package GamerApp.business.abstracts;

import java.util.List;

import GamerApp.entities.concretes.Campaign;

public interface CampaignService {

	public void add(Campaign campaign);
	public void delete (Campaign campaign);
	public void update(Campaign campaign);
	public Campaign getById(int id);
	public List<Campaign> getAll();
	
}
