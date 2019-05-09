package sorting;

import java.util.Arrays;

public class TwoElements {
	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 70, -80, 85 };
		Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;
		int min_val = Integer.MAX_VALUE;
		int lindex = -1;
		int rindex = -1;
		while (l < r) {
			int sum = arr[l] + arr[r];
			if (Math.abs(sum) < min_val) {
				min_val = Math.abs(sum);
				lindex = l;
				rindex = r;
			}

			if (sum < 0)
				l++;
			else
				r--;
		}

		System.out.println("The Min values is: " + min_val + " lIndex : " + arr[lindex] + " rIndex : " + arr[rindex]);
	}
}
