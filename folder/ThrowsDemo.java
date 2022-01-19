package MultiThreading;

public class ThrowsDemo {
void Division()throws ArithmeticException{
	int a=45,b=0,res;
	res=a/b;
	System.out.println("Result is "+res);
}
	public static void main(String[] args) {
	ThrowsDemo t=new ThrowsDemo();
	try {
		t.Division();
		}
	catch(ArithmeticException e) {
		System.out.println("Error:"+e.getMessage());
		
	}
	System.out.println("End of Program");
	}
}

