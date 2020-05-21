import java.util.Scanner;

import services.PrintService;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		//ps.addValue("Airton");
		
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		ps.print();
		String x = ps.first();
		System.out.println("First: "+x);
		sc.close();
	}

}
