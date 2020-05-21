package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.removeIf(x -> x.length() >=3); remove que tem mais de 3 caracteres
		//set.removeIf(x -> x.charAt(0) == 'T'); remove todos que tem a letra T
		
		//existe o elementos notebook?
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
	}

}
