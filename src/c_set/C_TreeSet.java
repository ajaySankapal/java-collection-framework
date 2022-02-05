package c_set;

import java.util.Set;
import java.util.TreeSet;

//set of sorted elements
//O(log N)
public class C_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> treeset = new TreeSet<>();
		//+
		treeset.add(10);
		treeset.add(1);
		treeset.add(5);
		treeset.add(22);
		treeset.add(8);
		treeset.add(10);
		System.out.println(treeset);
	}

}
