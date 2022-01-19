package MultiThreading;
class Table{
	synchronized void printTable(int n){
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
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(5);
	}
}
class MyThread3 extends Thread{
	Table t;
	public MyThread3(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(100);
	}
}
public class SynchronizedMethod{

	public static void main(String[] args) {
	Table obj=new Table();
	MyThread2 t1=new MyThread2(obj);
    MyThread3 t2=new MyThread3(obj);
    t1.start();
    t2.start();
	}
}
