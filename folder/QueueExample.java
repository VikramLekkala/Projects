package PracticeProject1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample{
public static void main(String[] args) {
	Queue<String> q=new LinkedList<>();
	q.add("Hyderabad");
	q.add("Chennai");
	q.add("Mumbai");
	q.add("Pune");
    q.add("Bangalore");
    System.out.println("Queue is" +q);
    System.out.println("Head of Queue is "+q.peek());
    q.remove();
    System.out.println("After removing head of Queue is "+q.peek());
    System.out.println(q);
  System.out.println("Size of Queue: "+q.size());
}
}
