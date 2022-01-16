package PracticeProject1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Collections {
public static void main(String[] args) {
	//creating arraylist
	System.out.println("Arraylist");
	ArrayList<String> al=new ArrayList();
	al.add("name");
	al.add("city");
	al.add("name");
	al.add(null);
	System.out.println(al);
	
	
	//creating vector
	System.out.println("Vector");
   Vector<Integer> v=new Vector<Integer>();
   v.add(1);
   v.add(2);
   v.add(3);
   v.add(null);
   v.add(2);
   System.out.println(v);

   
   
   //creating Linkedlist
   System.out.println("Linkedlist");
   LinkedList<String> ll=new LinkedList();
   ll.add("hyderabad");
   ll.add("bangalore");
   ll.add("pune");
   ll.add("pune");
   ll.add(null);
   System.out.println(ll);

   
   //priorityqueue
   System.out.println("PriorityQueue");
   PriorityQueue<Integer> pq=new PriorityQueue();
   pq.add(10);
   pq.add(20);
   pq.add(30);
   pq.add(20);
  // pq.add(null); --null pointer exception
   System.out.println(pq);
   
   //ArrayDeque
   System.out.println("Deque");
   ArrayDeque<String> dq=new ArrayDeque<String>();
   dq.add("vikram");
   dq.add("srikanth");
   dq.add("srikanth");
   //dq.add(null);----null pointer exception
  // dq.add(null);---not accept null values
   System.out.println(dq);
   
   
   //HashSet
   System.out.println("HashSet");
   HashSet<Integer> hs=new HashSet<Integer>();
   hs.add(2);
   hs.add(4);
   hs.add(1);
   hs.add(3);
   hs.add(2);//duplicates are not allowed
   hs.add(null);
   System.out.println(hs);
   
   //LinkedHashset
   System.out.println("LinkedHashset");
   
   LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
   lh.add(1);
   lh.add(4);
   lh.add(1);//duplicate values are not allowed
   lh.add(2);
   lh.add(3);
   lh.add(null);
   System.out.println(lh);
   }
}
