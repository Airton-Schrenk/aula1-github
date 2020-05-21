package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product7;
import entities.ProductService;

public class ExeFunction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Function função map
		List<Product7> list = new ArrayList<>();

		list.add(new Product7("TV", 900.00));
		list.add(new Product7("Mouse", 50.00));
		list.add(new Product7("Table", 350.50));
		list.add(new Product7("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list,p ->p.getName().charAt(0)=='M');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
