package application;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;
import entities.Product4;

public class ExeLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product4> list = new ArrayList<>();
		
		list.add(new Product4("TV", 900.00));
		list.add(new Product4("NOTEBOOK", 1200.00));
		list.add(new Product4("TABLET", 450.00));
		//comparator é uma interface funcional = tem apenas um método
		
		list.sort((p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product4 p : list) {
			System.out.println(p);
		}
	}

}
