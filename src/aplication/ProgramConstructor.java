package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.ProductConstructor;

public class ProgramConstructor {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		ProductConstructor product = new ProductConstructor(name, price);
		
		System.out.println();
		System.out.println("product data: " + product);
		//System.out.println(product.name +" , " + product.price +" , " + product.quantity);
		System.out.println();
		System.out.print("Enter the number of products to be add to stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);//atualiza a quantidade
		
		product.setName ("computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("update price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed to stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}


