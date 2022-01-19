package MultiThreading;

public class ThrowDemo {

	public static void main(String[] args) {
		int a=45,b=0,res;
		try {
			if(b==0)
				throw(new ArithmeticException("can't divide by zero."));
			else {
				res=a/b;
				System.out.println("the result is "+res);
			}
		}catch(ArithmeticException e) {
			System.out.println("Error:" +e.getMessage());
			
		}
System.out.println("End of program");
	}

}
