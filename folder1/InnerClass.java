package pkg1;

class Outer {

class Inner{
public	void  show(){
		System.out.println("Inner class method");
	}
}
}
class InnerClass{
	public static void main(String[] args) {
		Outer.Inner in =new  Outer().new Inner();
		in.show();
	}
}

