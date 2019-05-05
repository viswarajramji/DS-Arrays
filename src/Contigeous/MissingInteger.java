package Contigeous;

public class MissingInteger {
	static void find_missing_values(int arr[]) {
		int res = 1;
		int n = arr.length;
		for (int i = 0; i < n && arr[i] <= res; i++) {
			res += arr[i];
		}
		System.out.println("the mini Integer values = " + res);
	}

	public static void main(String[] args) {
		int arr[] ={1, 1, 3, 4}; 
		find_missing_values(arr);
	}
}
