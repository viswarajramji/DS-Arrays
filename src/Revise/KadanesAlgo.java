package Revise;

public class KadanesAlgo {
	public static void main(String[] args) {
		int arr[] = { 4, 1, 1, -1, -3, -5, 6, 2, -6, -2 };
		int k1 = 3;

		for (int k = 0; k < k1; k++) {
			int s = 0, start = 0, end = 0;
			int max_here = 0;
			int max_over_all = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				max_here += arr[i];
				if (max_over_all < max_here) {
					max_over_all = max_here;
					start = s;
					end = i;
				}
				if (max_here < 0) {
					max_here = 0;
					s = i + 1;
				}
			}
			System.out.println("Max_values=" + max_over_all + " start=" + start + " end=" + end);
			for (int s1 = start; s1 <= end; s1++) {
				arr[s1] = Integer.MIN_VALUE;
			}
		}
	}
}
