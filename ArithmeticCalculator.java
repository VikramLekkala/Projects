package PracticeProject1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double num1,num2;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the numbers");
 num1=sc.nextDouble();
 num2=sc.nextDouble();
 System.out.println("Enter the operator");
 char c=sc.next().charAt(0);
 double ans=0;
 switch(c) {
 //to add two numbers
 case '+':
	System.out.println(ans=num1+num2); 
	break;
	//to multiply two numbers
 case '*':
 System.out.println(ans=num1*num2);
 break;
 //to substract two numbers
 case '-':
	 System.out.println(ans=num1-num2);
	 break;
	 //to divide two numbers
 case '/':
	 System.out.println(ans=num1/num2);
	 break;
	 default:
		 System.out.println("wrong input");
		 break;
 }
	}

}
