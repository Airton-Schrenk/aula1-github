package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		//diference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
