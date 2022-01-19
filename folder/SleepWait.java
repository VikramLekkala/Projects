package MultiThreading;

public class SleepWait {
private static Object LOCK=new Object();
	public static void main(String[] args) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		
		e1.printStackTrace();
	}	
	
	System.out.println("Thread" +Thread.currentThread().getName()+"is woken after sleeping for 1 sec");
	synchronized(LOCK) {
		try {
			LOCK.wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Object"+LOCK+" is woken ofter  waitiong for 1 sec");
	
	
	}
	
	}

}
