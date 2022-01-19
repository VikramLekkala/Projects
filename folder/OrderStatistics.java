package PracticeProject1;
class KthSmallest{
	int KthSmallest(int arr[],int I,int r,int k) {
		if(k>0 && k<=r-I+1) {
			int pos=partition(arr,I,r);
			if(pos-I==k-1)
				return arr[pos];
			if(pos-I>k-1)
			return KthSmallest(arr,I,pos-1,k);
			return KthSmallest(arr,pos+1,r,k-pos+I-1);
		}
		return Integer.MAX_VALUE ;
	}
void swap(int arr[],int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
	int partition(int arr[],int I,int r) {
		int x=arr[r],i=I;
		for(int j=I;j<=r-1;j++) {
			if(arr[j]<=x) {
				swap(arr,i,j);
				i++;
			}
		}
		swap(arr,i,r);
		return i;
	}
	int randomPartition(int arr[],int I,int r) {
		int n=r-I+1;
		int pivot=(int)(Math.random())*(n-1);
		swap(arr,I+pivot,r);
		return partition(arr,I,r);
	}
}
public class OrderStatistics {

	public static void main(String[] args) {
		KthSmallest obj=new KthSmallest();
		int arr[]= {1,2,3,5,7,4,19,26};
		int n=arr.length,k=7;
		System.out.println("K'th smallest element is "+obj.KthSmallest(arr, 0, n-1, k));

	}

}
