package c_set;

import java.util.HashSet;
import java.util.Set;

//no duplicates elements allowed in set
//order is not defined in set. 
//if we print its elements it prints in random order

public class A_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Set<Integer> set = new HashSet<>();
		//+
		set.add(10);
		set.add(1);
		set.add(5);
		set.add(22);
		set.add(8);
		set.add(10);
		System.out.println(set);
		
		//O(1) time complexity 
		//-
		set.remove(22);
		System.out.println(set);
		
		//isContain
		System.out.println(set.contains(22));
		
		//isEmpty
		System.out.println(set.isEmpty());
		
		//size()
		System.out.println(set.size());
		
		//set.clear();
		
		
	}

}
