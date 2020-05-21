package util;

import java.util.function.Function;

import entities.Product6;

public class UpperCaseName implements Function<Product6, String> {

	@Override
	public String apply(Product6 p) {
		// TODO Auto-generated method stub
		return p.getName().toUpperCase();
	}

}
