package PracticeProject1;

import java.util.Scanner;

public class StringofArray {
public static void main(String[] args) {
	String arr[]=new String[5];
	String n;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements in array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextLine();
	}
	System.out.println("array elements");
  for(int i=0;i<arr.length;i++) {
	  System.out.println(arr[i]+" ");
  }
  
System.out.println("\nEnter search elements");
n=sc.nextLine();
for(int i=0;i<arr.length;i++) {
	if(arr[i].equals(n)) {
		count++;
		
	}
	
}
if(count>0) {
	System.out.println("item found "+count+ "times");
}
	else {
	System.out.println("item not found");	
	}		
}
}
