package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Generics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		//abrir o arquivo e ler todas as linhas
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line!= null){
				String[]fields = line.split(",");
				
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x  = CalculationService.max(list);
			System.out.println("MAX: ");
			System.out.println(x);
		}catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
				
				
	}

}
