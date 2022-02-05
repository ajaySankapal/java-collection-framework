package g_collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import c_set.Student;

public class B_sort_custom_class {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Ajay",20));
		list.add(new Student("Raja",11));
		list.add(new Student("Aman",15));
		
		Student s1 = new Student("Ramesh", 10);
		Student s2 = new Student("Raju", 9);
		
//		System.out.println(s1.compareTo(s2));
		
//		System.out.println(list);
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		
		System.out.println(list);
		
		

	}

}
