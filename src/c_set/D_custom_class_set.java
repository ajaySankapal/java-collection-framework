package c_set;

import java.util.HashSet;
import java.util.Set;

public class D_custom_class_set {

	public static void main(String[] args) {
		// custom HashSet
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student ("ajay",20));
		studentSet.add(new Student ("raja",19));
		studentSet.add(new Student ("sandeep",18));
		studentSet.add(new Student ("aman",20));
		System.out.println(studentSet);
		

	}

}
