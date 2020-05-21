package entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
	
	public double filteredSum(List<Product7>list, Predicate<Product7>criteria) {
		double sum = 0.0;
		for(Product7 p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
