package Contigeous;

public class MaxIncreasingSub {
	static void max_increasing_sum(int arr[]) {
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[i];

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && temp[i] < temp[j] + arr[i]) {
					temp[i] = temp[j] + arr[i];
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < temp.length; i++) {
			if (max < temp[i]) {
				max = temp[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int arr[]= {1, 101, 2, 3, 100, 4, 5}; 
		max_increasing_sum(arr);
	}
}
