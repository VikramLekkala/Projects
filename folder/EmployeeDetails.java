package PracticeProject1;

class Employee{
	int emp_id;
	String emp_name;
	double sal;
	int emp_id() {
		return emp_id;
   }
	String emp_name() {
		return emp_name;
	}
	double sal() {
		return sal;
	}
	
}
public class EmployeeDetails{
	public static void main(String[] args) {
		Employee obj=new Employee();
		 obj.emp_id=10;
		 obj.emp_name="abc";
		 obj.sal=2000.0;
	System.out.println("Employee id ="+obj.emp_id);
	System.out.println("Employee name="+obj.emp_name);
	System.out.println("Employee salary="+obj.sal);
	 obj.emp_id=20;
	 obj.emp_name="xyz";
	 obj.sal=4000.0;
System.out.println("Employee id ="+obj.emp_id);
System.out.println("Employee name="+obj.emp_name);
System.out.println("Employee salary="+obj.sal);
	}

}

