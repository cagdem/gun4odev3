package oyun.concretes;

import oyun.abstracts.DiscountService;
import oyun.entities.Discount;

public class DiscountManager implements DiscountService{

	@Override
	public void add(Discount discount) {
		System.out.println("Yeni kampanya eklendi: "+ discount.getName() + ", "+ discount.getValue());
	}

	@Override
	public void update(Discount discount) {
		System.out.println("Kampanya guncellendi: "+ discount.getName() + ", "+ discount.getValue());
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println("Kampanya silindi: "+ discount.getName());
		
	}

}
