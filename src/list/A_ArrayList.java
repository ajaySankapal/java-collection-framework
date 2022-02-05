package list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class A_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		
		//add at the end of the list
		names.add("Ajay");
		names.add("Raja");
		names.add("Aman");
		System.out.println(names);
		
		names.add("Aayush");
		System.out.println(names);
		
		//if we want to add element at particular index we can provide index and element
		names.add(1, "Sandeep");
		System.out.println(names);
		
		//we can also add complete list also by .addAll
		ArrayList<String> newBatch = new ArrayList<>();
		newBatch.add("Raju");
		newBatch.add("Arun");
		names.addAll(newBatch);
		System.out.println(names);
	
		//get element
	 System.out.println(names.get(0));
	 
//	 removes element
	 names.remove(6);
	 System.out.println(names);
	 
	 //remove the value of element we pass by 
	 names.remove(String.valueOf("Aman"));
	 System.out.println(names);
	 
	 //clear all the elements of the list
//	 names.clear();
//	 System.out.println(names);
	 
	 //update value of element at given index
	 names.set(3, "Sandeep");
	 System.out.println(names);
	 
	 //contains() whether the element is present in the list or not
	System.out.println(names.contains("Sandeep"));  //returns true or false
	
	//list.size() will give us what's the size of the list .. how many elements
	// how to iterate through the list
	for(int i = 0;i<names.size();i++) {
		System.out.print(names.get(i)+" ");
	}
	System.out.println();
	
	//forEach
	for(String element:names) {
		System.out.print(element+" ");
	}
	
	//iterator
	System.out.println();
	Iterator<String> it = names.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}

	}

}
