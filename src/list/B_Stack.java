package list;

import java.util.Stack;

//first in last out


public class B_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals = new Stack<>();
		
		//to add items in stack
		animals.push("horsh");
		animals.push("cat");
		animals.push("lion");
		animals.push("dog");
		System.out.println(animals);
		
		System.out.println(animals.peek());
		
		//remove : pop();
		animals.pop();
		System.out.println(animals);
		System.out.println(animals.peek());

	}

}
