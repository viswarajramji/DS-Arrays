package order_statics;

public class MissingNumber {

	static void process_values(int arr[]) {
		int index = find_values(arr, 0, arr.length - 1);
		if (index == -1) {
			System.out.println("order proper");
			return;
		}
		System.out.println("missing values=" + index);
	}

	static int  find_values(int arr[],int start,int end) {
		if(end<start) {
			return -1;
		}
		if(start!=arr[start])
			return start;
		int mid=(start+end)/2;
		if(mid==arr[mid]) {
			return find_values(arr, mid+1, end);
		}
		return find_values(arr, start, mid-1);
	}

	public static void main(String args[]) {
		int arr[]= {0,1,2,4,5,6};
		process_values(arr);
	}
}
