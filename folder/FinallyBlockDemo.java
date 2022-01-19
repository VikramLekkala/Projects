package MultiThreading;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		int a=45,b=0,res=0;
		try {
			res=a/b;
		}catch(ArithmeticException e) {
			System.out.println("Error "+e.getMessage());
		}
		finally {
			System.out.println("The result is:"+res);
		}

	}

}
