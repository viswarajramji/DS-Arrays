package order_statics;

public class findMissingNumber {
	static void process_values(int arr[]) {
		int n = arr.length;
		int index=find_missing_values(arr, 0, n-1);
		if(index==-1) {
			System.out.println("value is proper");
			return;
		}
		System.out.println("missing index : "+index);
	}

	static int find_missing_values(int arr[], int start, int end) {
		if (end < start) {
			return -1;
		} else if (start != arr[start]) {
			return start;
		}
		int mid = (start + end)/2;
		if (mid == arr[mid]) {
			return find_missing_values(arr, mid + 1, end);
		}
		return find_missing_values(arr, start, mid);

	}

	public static void main(String[] args) {
		 int arr[] = {0,1,2,4}; 
		process_values(arr);
	}
}
