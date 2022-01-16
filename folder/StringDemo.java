package PracticeProject1;

public class StringDemo {
public static void main(String[] args) {
	System.out.println("methods of strings");
	String s1=new String("hello world");
	System.out.println(s1.length());
	String sub=new String("welcome");
	System.out.println(sub.substring(2));
	//string comparision
	String s2="hello";
	String s3="heldo";
	System.out.println(s1.compareTo(s2));
  //string buffer
	System.out.println("creating string buffer");
	StringBuffer s=new StringBuffer("welcome to java");
	s.append("Enjoy your learning");
	System.out.println(s);
	//string builder
	System.out.println("creating to string builder");
   StringBuilder sb1=new StringBuilder("Java");
   sb1.append("learning");
   System.out.println(sb1);
}
}

