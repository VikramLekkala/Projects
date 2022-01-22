package PracticeProject1;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {3,5,2,8,4};
		int length=arr.length;
		selectionSort(arr);
		System.out.println("The Sorted Elements are:");
      for(int i:arr) {
    	  System.out.println(arr);
      }
	}

	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}

}
