import java.util.Arrays;

public class BinarySearchIndex {

	public static int binarySearchIndex(int[] arr, int item) {

		int length = arr.length;

		int hi = length-1;
		int lo = 0;
		int mid; 
		
		while (lo <= hi) {

			mid = (hi + lo)/2;
			if (item > arr[mid]) {
				lo = mid + 1;
			}
			else if (item < arr[mid]) {
				hi = mid - 1;
			}
			else {
				return mid;
			}
		}

		return -1;


	}

	public static void main(String[] args) {


		int[] arr = {1,2,3,4,5,6};
		
		System.out.println(binarySearchIndex(arr,2));
	}


}