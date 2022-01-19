package MultiThreading;
class MyThread extends Thread{
	public void run() {
		System.out.println(this.getId()+"My Thread");
		
	}
}
public class ThreadExtends {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.setPriority(4);
  th.start();
  System.out.println("main method");
	}

}

