package MultiThreading;

class Table2{
	 void printTable(int n){
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
		try {
			Thread.sleep(400);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hello");
		}
		
	}	
}
class MyThreadclass extends Thread{
	Table2 t;
	MyThreadclass(Table2 t){
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(5);
	}
}
class MyThreadclass2 extends Thread{
	Table2 t;
	public MyThreadclass2(Table2 t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(100);
	}
}
public class WithoutSynchronised{

	public static void main(String[] args) {
	Table2 obj=new Table2();
	MyThreadclass t1=new MyThreadclass(obj);
    MyThreadclass2 t2=new MyThreadclass2(obj);
    t1.start();
    t2.start();
	}
}
