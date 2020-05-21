package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import entities.EmployeeLambda;

public class ExeLambda7 {

	public static void main(String[] args) {
		// Mostrar tamb�m a soma dos sal�rios dos funcion�rios cujo
		//nome come�a com a letra 'M'
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<EmployeeLambda> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[]fields = line.split(",");
				list.add(new EmployeeLambda(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(x -> x.getSalary()> salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than"+ String.format("%.2f", salary)+":");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) =='M')
					.map(x-> x.getSalary())
					.reduce(0.0,(x,y)-> x+y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
											
		}catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		sc.close();

	}

}
