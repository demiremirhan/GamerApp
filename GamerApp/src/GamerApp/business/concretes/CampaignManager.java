package GamerApp.business.concretes;

import java.util.List;

import GamerApp.business.abstracts.CampaignService;
import GamerApp.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("added campaign !!" + campaign.getCampaignName());
		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("deleted campaign !!" + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("updated campaign !!" + campaign.getCampaignName());
		
	}

	@Override
	public Campaign getById(int id) {
		System.out.println("get by id campaign" );
		return null;
	}

	@Override
	public List<Campaign> getAll() {
		System.out.println("get all campaign");
		return null;
	
	}

}
