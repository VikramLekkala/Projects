package PracticeProject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation
{
	public static boolean isValidEmail(String email) 
	{
		   String regex = "^(.+)@(.+)$";
		 //  initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	 public static void main(String[] args)
	 {
	       List<String> emails = new ArrayList<String>();
	       //valid email addresses
	       emails.add("abc@gmail.com");
	       emails.add("xyz12@gmail.com");
	       emails.add("Java@.fsd.org");
	       emails.add("mph@org.com");
	       //invalid email addresses                       
	       emails.add("java.full.com");
	       emails.add("xyz...com");
	       emails.add("abc.mail.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	   	
	       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine();
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		       
		   }
	}

	       
	       
