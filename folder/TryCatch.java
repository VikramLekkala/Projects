package MultiThreading;

public class TryCatch {

	public static void main(String[] args) {
		int[] array=new int[3];
		try {
			array[7]=3;
		}
 catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println("Array index is out of bounds");
 }
		finally {
			System.out.println("The Array is of size="+array.length);
		}
	}

}
