package application;

import java.util.Map;
import java.util.TreeMap;

public class AulaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "95305886");
		
		cookies.remove("email");
		cookies.put("phone", "95635751");
		
		System.out.println("Contains 'phone' key: "+cookies.containsKey("phone"));
		System.out.println("Phone number: "+ cookies.get("phone"));
		System.out.println("Email: "+ cookies.get("email"));
		System.out.println("Size: "+ cookies.size());
		
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ":"+cookies.get(key));
		}
	}

}
