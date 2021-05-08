package oyun.concretes;

import oyun.abstracts.UserCheckService;
import oyun.entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public void checkIfRealPerson(User user) {

		System.out.println("Bu kisi gercektir: " + user.getFirstName());
	}

}
