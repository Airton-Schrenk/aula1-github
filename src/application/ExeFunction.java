package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product6;
import util.UpperCaseName;

public class ExeFunction {

	public static void main(String[] args) {
		// Function função map
		List<Product6> list = new ArrayList<>();
		
		list.add(new Product6("TV", 900.00));
		list.add(new Product6("Mouse", 50.00));
		list.add(new Product6("Table", 350.50));
		list.add(new Product6("HD Case", 80.90));
		//1.Implementação da interface
		//List<String>names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//2.Reference method com método estático
		//List<String>names = list.stream().map(Product6::staticUpperCaseName).collect(Collectors.toList());
		
		//3.Reference method com método Não estático
		//List<String>names = list.stream().map(Product6::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//4.Expressão Lambda declarada
		//Function<Product6, String> func = p -> p.getName().toUpperCase();
		
		//5.Expressão Lambda inline
		//Function<Product6, String> func = p -> p.getName().toUpperCase();
				
		List<String>names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
				
		names.forEach(System.out::println);
	}

}
