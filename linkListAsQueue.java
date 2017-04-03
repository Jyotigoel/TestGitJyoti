package program;

import java.util.LinkedList;

public class linkListAsQueue {

	public static void main(String[] args)
	{
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(10);
		  queue.addFirst(30);
		queue.offerFirst(20);
		 
        queue.addFirst(30);
 
        queue.offer(40);
        System.out.println(queue);   
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        
		
	}
	

	
}
