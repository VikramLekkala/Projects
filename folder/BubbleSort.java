package PracticeProject1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {15,12,34,54,25};
		bubbleSort(arr);
		System.out.println("Sorted Elements are:");
	for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void bubbleSort(int[] arr) {
		int length=arr.length;
		 int temp=0;
		for(int i=0;i<length;i++) {
			for(int j=1;j<(length);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
