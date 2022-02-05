package b_queue;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//queue interface is implementated by LinkedList

public class A_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization//implementation of queue by LinkedList
		Queue<Integer> queue = new LinkedList<>();
		
		//add elements in queue
		queue.offer(12);
		queue.offer(11);
		queue.offer(10);
		queue.offer(9);
		System.out.println(queue);
		
		// clear whole queue
//		queue.clear();
//		System.out.println(queue);
		
		queue.add(8);
		System.out.println(queue);
		System.out.println(queue.contains(9));
		  
//      remove first element which is added
	   System.out.println(queue.poll() );	
	   System.out.println(queue);
	   
// 
	   System.out.println(queue.peek());
	   
	   List<Integer> list = new ArrayList<>();
	}

}
