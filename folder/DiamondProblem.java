package PracticeProject1;
interface First{
	default void show() {
		System.out.println("Default first");
	}
}
  interface Second{
	default void show() {
		System.out.println("Default second");
		}
}
public class DiamondProblem implements First,Second{

	
public void show() {
	First.super.show();
	Second.super.show();
}
public static void main(String[] args) {
DiamondProblem ob=new DiamondProblem();
ob.show();
	}

}
