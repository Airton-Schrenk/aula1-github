package util;

import java.util.function.Predicate;

import entities.Product4;

public class ProductPredicate implements Predicate<Product4> {

	@Override
	public boolean test(Product4 p) {
		// TODO Auto-generated method stub
		return p.getPrice()>= 100.00;
	}

}
