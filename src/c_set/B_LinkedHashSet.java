package c_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class B_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lhset = new LinkedHashSet<>();
		lhset.add(10);
		lhset.add(1);
		lhset.add(5);
		lhset.add(3);
		System.out.println(lhset);
		
	   //-
	   lhset.remove(5);
	   System.out.println(lhset);
				
	   //isContain
	   System.out.println(lhset.contains(22));
				
	   //isEmpty
	   System.out.println(lhset.isEmpty());
				
	   //size()
	   System.out.println(lhset.size());
				
	   //set.clear();
		

	}

}
