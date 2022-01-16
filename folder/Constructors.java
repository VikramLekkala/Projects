package PracticeProject1;

class Student{
	int id;
	String name;
	
	public Student() {
	//default constructor	
	}

	

	void display() {
		System.out.println(id +" "+ name);
	}
}
public class Constructors {
public static void main(String[] args) {
	//calling default constructors
	Student obj=new Student();
	obj.display();
}
}

