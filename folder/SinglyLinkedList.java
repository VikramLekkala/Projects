
package PracticeProject1;

public class SinglyLinkedList {
 Node head;
static class Node{
	int data;
	Node next;
	 Node(int d) {
		data=d;
		next=null;
	}
}
//method to insert new node
public static SinglyLinkedList insert(SinglyLinkedList list,int data) {
	//create new node with given data
	Node new_node=new Node(data);
	new_node.next=null;
	//if the linked list is empty make the new node as head
	if(list.head==null) {
		list.head=new_node;
	}
	else {
		//else traverse till the last node and insert the new node there
		Node last=list.head;
		while(last.next!=null) {
			last=last.next;
		}
		//insert the new node at last
		last.next=new_node;
	}
	return list;
}
public static void printList(SinglyLinkedList list) {
	Node currNode=list.head;
	System.out.println("linked List:");
	//traverse through the linkedlist
	while(currNode!=null) {
		//print the data at current node
		System.out.println(currNode.data+"");
		//go to next node
		currNode=currNode.next;
	}
	System.out.println();
}
//method to delete a node in the linked list by key
public static SinglyLinkedList deleteByKey(SinglyLinkedList list,int key) {
	//store head node
	Node currNode=list.head,prev=null;
	if(currNode!=null && currNode.data==key) {
		list.head=currNode.next;//changed head
		System.out.println(key+"found and deleted");
	return list;
	}
	while(currNode!=null && currNode.data!=key) {
		prev=currNode;
		currNode=currNode.next;
	}
	if(currNode!=null) {
		prev.next=currNode.next;
		System.out.println(key+"found and deleted");
	}
	if(currNode==null) {
		System.out.println(key+" not found");
	}
	return list;
}
//method to create a singly linked list with n nodes
	public static void main(String[] args) {
		//start with the empty list
		SinglyLinkedList list=new SinglyLinkedList();
		//insert the values
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,6);
		list=insert(list,7);
		list=insert(list,8);
		//print the linked list
		printList(list);
		//delete node with value 1
		deleteByKey(list,1);
		//print the linkedlist
		printList(list);
		//delete node with value 4
		deleteByKey(list,4);
		//print the linkedlist
		printList(list);
				//delete node with value 10
				deleteByKey(list,10);
				//print the linkedlist
				printList(list);
	}

}
