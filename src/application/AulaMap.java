package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product3;

public class AulaMap {

	public static void main(String[] args) {
		
		Map<Product3, Double> stock = new HashMap<>();
		
		Product3 p1 = new Product3("TV", 900.00);
		Product3 p2 = new Product3("TV", 1200.00);
		Product3 p3 = new Product3("TV", 400.00);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product3 ps = new Product3("TV", 900.00);
		
		System.out.println("Contains 'ps' key: "+ stock.containsKey(ps));
	}
}
