package Revise;

public class SmallestValues {
	public static void main(String[] args) {
		int res = 1;
		int arr[] = {1, 3, 4, 5}; 
		for (int i = 0; i < arr.length && res >= arr[i]; i++) {
			res += arr[i];
		}
		System.out.println(res);
	}
}
