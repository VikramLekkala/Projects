package pkg2;

import pkg1.Parent;

class child2 extends Parent{
void display() {
	//method();
	//method1();--default is used within the pkg only
	method2();
	method3();
}
}
class class2{
	 void display() {
		 Parent p=new Parent();
		// p.method();
		// p.method1();
		// p.method2();
		 p.method3();
	 }
}
public class Accessmodifiers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child2 c=new child2();
c.display();
class2 c2=new class2();
c2.display();
	}

}

