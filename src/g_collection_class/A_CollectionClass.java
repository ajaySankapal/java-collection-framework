package g_collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A_CollectionClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(21);
		list.add(5);
		list.add(9);
		list.add(13);
		list.add(21);
		list.add(21);
		list.add(8);
     int min =	Collections.min(list);
     System.out.println(min);
     
     int max =	Collections.max(list);
     System.out.println(max);
     
     int freq = Collections.frequency(list, 21);
     System.out.println(freq);
     
     System.out.println(list);
     
    Collections.sort(list);
    System.out.println(list);
    
    Collections.sort(list,Comparator.reverseOrder());
    System.out.println(list);
		

	}

}
