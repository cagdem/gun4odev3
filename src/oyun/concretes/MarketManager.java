package oyun.concretes;

import oyun.abstracts.MarketService;
import oyun.entities.Discount;
import oyun.entities.Game;
import oyun.entities.User;

public class MarketManager implements MarketService{

	@Override
	public void buy(Game game, User user) {
		System.out.println(user.getFirstName()+" "+ game.getName()+ " oyununu aldi, "+game.getPrice()+ "tl odendi.");		
	}

	@Override
	public void buy(Game game, User user, Discount discount) {
		System.out.println(discount.getName()+" kampanyasi kullanildi.");
		System.out.println(user.getFirstName()+" "+ game.getName()+ " oyununu aldi, "+(game.getPrice()-discount.getValue())+ "tl odendi.");		

	}

}
