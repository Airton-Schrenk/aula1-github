package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product5;

public class InterfaceConsumer {

	public static void main(String[] args) {
		// Aumentar o preço de cada produto em 10%
		List<Product5> list = new ArrayList<>();
		
		list.add(new Product5("TV", 900.00));
		list.add(new Product5("Mouse", 50.00));
		list.add(new Product5("Table", 350.50));
		list.add(new Product5("HD Case", 80.90));
		//1.Interface
		//list.forEach(new PriceUpdate());
		
		//2.Método estático
		//list.forEach(Product5 ::staticPriceUpdate);
		
		//3.Reference method não estático
		//list.forEach(Product5 :: nonStaticPriceUpdate);
		
		//4.Expressão lambda declarada
		double factor = 1.1;
		//Consumer<Product5> cons = p ->
			//p.setPrice(p.getPrice()*factor);
		
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		list.forEach(System.out::println);
	}

}
