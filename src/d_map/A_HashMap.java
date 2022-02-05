package d_map;

import java.util.HashMap;
import java.util.Map;

// store key:value pair 

public class A_HashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> user = new HashMap<>();
        
		user.put("one", 1);
		user.put("two", 2);
		user.put("three", 3);
		user.put("four", 4);
		user.put("five", 5);
		user.put("six", 6);
		System.out.println(user);
		
		//override the value of same key
//		user.put("name", "sam");
//		System.out.println(user);
		
		//if we want to prevent the override
		user.putIfAbsent("two", 2);
		System.out.println(user);
		
		//iterate
		for(Map.Entry<String, Integer> e:user.entrySet()) {
			System.out.print(e+" ");
			System.out.print(e.getKey()+" ");
			System.out.print(e.getValue()+" ");
		}
		for(String key: user.keySet()) {
			System.out.println(key);
		}
		for(Integer value: user.values()) {
			System.out.println(value);
		}
		
		//user.containsValue();
		//user.isEmpty();
		//user.clear();
		
	}

}
