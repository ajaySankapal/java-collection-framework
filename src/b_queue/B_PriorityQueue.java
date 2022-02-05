package b_queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class B_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//by default minheap priority : smallest element have greater priority
		//Comparator.reverseOrder() change priority to maxheap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(5);
        pq.offer(18);
        pq.offer(22);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
	}

}
