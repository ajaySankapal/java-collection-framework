package c_set;

import java.util.Objects;

public class Student {

	String name;
	int rollNo;
	public  Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{"+
				"name='" + name + '/'+
				",rollNo=" + rollNo + 
	'}';
	}
	




	




	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(rollNo);
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Student student = (Student) obj;
		return rollNo == student.rollNo;
	}




	public static void main(String[] args) {
     
		
		
		
	}

}
