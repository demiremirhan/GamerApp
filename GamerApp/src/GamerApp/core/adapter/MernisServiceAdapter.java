package GamerApp.core.adapter;

import GamerApp.business.abstracts.UserCheckService;
import GamerApp.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result =false;
		try {
			result=proxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
					user.getFirstName(), user.getLastName(), user.getDateOfBirth().getYear());
		} catch (Exception e) {
			System.out.println("not a valid person");
		}
		return result;
	}

}
