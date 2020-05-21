package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.EmployeeII;

public class Comparable {

	public static void main(String[] args) {
		
		List<EmployeeII> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
		String employeeIICsv = br.readLine();
		while(employeeIICsv != null) {
			String[] fields = employeeIICsv.split(",");
			list.add(new EmployeeII(fields[0],Double.parseDouble(fields[1])));
			employeeIICsv = br.readLine();
			
		}
		Collections.sort(list);
		for(EmployeeII emp : list) {
			System.out.println(emp.getName()+", "+emp.getSalary());
		}
			
		}catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
