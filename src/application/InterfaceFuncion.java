package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product4;

public class InterfaceFuncion {

	public static void main(String[] args) {
		// INTERFACE funcional Predicate
		List<Product4> list = new ArrayList<>();
		
		list.add(new Product4("TV", 900.00));
		list.add(new Product4("Mouse", 50.00));
		list.add(new Product4("Table", 350.50));
		list.add(new Product4("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPrice()>=100);
		
		//list.removeIf(new ProductPredicate());
		//referência para método
		//list.removeIf(Product4::staticProductPredicate);
		
		
		//list.removeIf(Product4::nonStaticProductPredicate);
		double min = 100.0;
		//Predicate<Product4> pred = p -> p.getPrice()>=min;
		list.removeIf(p-> p.getPrice()>=min);
		
		for(Product4 p : list) {
			System.out.println(p);
		}
	}

}
