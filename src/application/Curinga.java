package application;

import java.util.Arrays;
import java.util.List;

public class Curinga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<?> myObjs = new ArrayList<Object>();
		//List<Integer> myNumbers = new ArrayList<Integer>();
		//myObjs = myNumbers; // erro de compilação
		
		//Instancia uma lista de inteiros
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "alex", "bob");
		printList(myStrs);
	}
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
