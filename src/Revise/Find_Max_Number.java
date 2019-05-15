package Revise;

public class Find_Max_Number {
	public static void main(String[] args) {
		int arr[] = { 5, 1, 2, 4, 3 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println(first + " " + second);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= second) {
				System.out.println(arr[i]);
			}
		}
	}
}
