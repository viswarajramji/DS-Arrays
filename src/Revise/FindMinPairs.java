package Revise;

public class FindMinPairs {
	public static void process(int arr1[], int n1, int arr2[], int n2) {
		int k = 3;
		int index[] = new int[n1];
		while (k > 0) {
			int min_index = 0;
			int min_value = Integer.MAX_VALUE;
			for (int i1 = 0; i1 < n1; i1++) {
				if (index[i1] < n2 && arr1[i1] + arr2[index[i1]] < min_value) {
					min_index = i1;
					min_value = arr1[i1] + arr2[index[i1]];
				}

			}
			System.out.println("val :" + min_value + " Pairs are as follows: arr1 " + arr1[min_index] + " arr2 "
					+ arr2[index[min_index]]);
			index[min_index]++;
			k--;
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 11 };
		int n1 = arr1.length;

		int arr2[] = { 2, 4, 8 };
		int n2 = arr2.length;

		process(arr1, n1, arr2, n2);
	}
}
