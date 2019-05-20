package Revise;

public class SumOfValue {
	public static void main(String[] args) {
		int arr1[] = { -8, 1, 4, 2, -6 };
		int start = 0, end = 0;
		int n = arr1.length;
		int x = 6;
		int curr_sum = 0;
		int min_point = Integer.MAX_VALUE;
		while (end < n) {
			while (curr_sum <= x && end < n) {
				if (curr_sum <= 0 && x > 0) {
					start = end;
					curr_sum = 0;
				}
				curr_sum += arr1[end++];
			}
			while (curr_sum > x && start < n) {
				if (end - start < min_point) {
					min_point = end - start;
				}
				curr_sum -= arr1[start++];
			}
		}
		
		System.out.println(min_point);
	}
}
