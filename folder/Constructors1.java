package PracticeProject1;

class Student1{
	int id;
	String name;
	
	public Student1(int id,String name) {
this.id=id;
this.name=name;
	}
	void display() {
		System.out.println(id +" "+ name);
	}
}
public class Constructors1 {
public static void main(String[] args) {
Student1 obj1=new Student1(10,"abc");
	obj1.display();
}
}

