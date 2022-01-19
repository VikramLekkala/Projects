package MultiThreading;
class MyException1 extends Exception{
	String str1;
 MyException1(String str2) {
		str1=str2;
	}
public String toString() {
	return ("My Exception Occured:"+str1);
}
}
 class ExceptionHandling {

	public static void main(String[] args) {
		try{
			System.out.println("starting of try block");
		//throwing custom exception using throw
			throw new MyException1("this is my error message");
		}catch(MyException1 e) {
	System.out.println("Catch Block");
System.out.println(e);
}
	}

}
