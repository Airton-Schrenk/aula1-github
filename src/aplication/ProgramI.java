package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("product data: " + product);
		//System.out.println(product.name +" , " + product.price +" , " + product.quantity);
		System.out.println();
		System.out.print("Enter the number of products to be add to stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);//atualiza a quantidade
		
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
