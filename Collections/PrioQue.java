package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PrioQue {
  public static void main(String[] args) {
    PriorityQueue <String> pq = new PriorityQueue<>();
    pq.add("a");
    pq.add("b");
    pq.add("c");
    pq.add("d");

    System.out.println("head: " + pq.element());
    System.out.println("head:" + pq.peek());
    System.out.println("iterating the queue elements");

    Iterator <String> i = pq.iterator();
    while(i.hasNext()) {
      System.out.println(i.next());
    } 

    pq.remove();
    pq.poll();
    
    System.out.println(pq);

    
  }
} 



/*The remove() and poll() methods differ only in their behavior when
 the queue is empty: the remove() method throws an exception, 
 while the poll() method returns null. */

/*The element and peek methods return, but do not remove,
 the head of the queue. They differ from one another in precisely the same
  fashion as remove and poll : if the queue is empty, 
  element throws NoSuchElementException while peek returns false . */