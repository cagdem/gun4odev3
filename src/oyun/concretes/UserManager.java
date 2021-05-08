package oyun.concretes;

import oyun.abstracts.UserCheckService;
import oyun.abstracts.UserService;
import oyun.entities.User;

public class UserManager implements UserService{

	UserCheckService userCheckService; 
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {

		userCheckService.checkIfRealPerson(user);
		System.out.println("Kullanici eklendi: "+ user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanici guncellendi: "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanici silindi: "+ user.getFirstName());
		
	}

}
