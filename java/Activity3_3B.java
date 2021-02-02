package activity;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Deque<String> dq = new LinkedList<String>();

		        dq.add("Tiger");
		        dq.addFirst("Lion");
		        dq.addLast("Wolf");
		        dq.offer("Hyena");
		    	dq.offerFirst("Puma");
		        dq.offerLast("Panther");
		        
				Iterator<String> iterator = dq.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }

		        //Peek at head element
		        System.out.println("Peek: " + dq.peekFirst());
		        System.out.println("Peek: " + dq.peekLast());
		        //To show that the element have not been deleted
		        System.out.println("After peek: " + dq);
		        
		        //Search for element
		        System.out.println("Contains Wolf?: " + dq.contains("Wolf"));

		        //Remove the first and last element
		        dq.removeFirst();
		        dq.removeLast();
		        System.out.println("dq after removing first and last elements: " + dq);
		        System.out.println("Size of deque after removal: " + dq.size());
		    }

	}

