package util;

import java.util.function.Consumer;

import entities.Product5;

public class PriceUpdate implements Consumer<Product5>{

	@Override
	public void accept(Product5 p) {
		// TODO Auto-generated method stub
		p.setPrice(p.getPrice()*1.1);
	}

}
