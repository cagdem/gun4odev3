package oyun;

import java.time.LocalDate;

import oyun.concretes.DiscountManager;
import oyun.concretes.MarketManager;
import oyun.concretes.UserCheckManager;
import oyun.concretes.UserManager;
import oyun.entities.Discount;
import oyun.entities.Game;
import oyun.entities.User;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Caglar", "Demir", LocalDate.of(1995, 6,21), "1111111111");
		Game game = new Game("Resident Evil 8", 250);
		Discount discount = new Discount("Yaz indirimi", 25);
		
		UserManager userManager = new UserManager(new UserCheckManager());
		MarketManager marketManager = new MarketManager();
		DiscountManager discountManager = new DiscountManager();
		
		userManager.add(user);
		userManager.update(user);
		userManager.delete(user);
		System.out.println();
		discountManager.add(discount);
		discountManager.update(discount);
		discountManager.delete(discount);
		System.out.println();
		marketManager.buy(game, user);
		marketManager.buy(game, user, discount);
		
		
	}

}
