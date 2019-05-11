package sorting;

import java.util.Arrays;

public class FindDistinctValuesK {
	public static void main(String[] args) {
		int arr[] = {0,2,2,4};
		int k = 4;
		Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			if (arr[l] + arr[r] == k) {
				System.out.println("Pairs : L - " + arr[l] + " R - " + arr[r]);
				l++;
				r--;
			} else if (arr[l] + arr[r] > k)
				r--;
			  else
				l++;
		}
	}
}
