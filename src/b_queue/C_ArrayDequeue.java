package b_queue;

import java.util.ArrayDeque;

public class C_ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(10);
		adq.addFirst(18);  //add in front of the queue
		adq.addLast(1);   // add at the last index of the queue
		System.out.println(adq);
		
		 System.out.println(adq.peek());
		 System.out.println(adq.peekFirst());
		 System.out.println(adq.peekLast());
		 
//		 adq.poll();
//		 System.out.println(adq);
		 
//		 System.out.println(adq.pollFirst());
//		 System.out.println(adq);
		 System.out.println(adq.pollLast());
		 System.out.println(adq);
		 
	}

}
