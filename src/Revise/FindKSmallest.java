package Revise;

public class FindKSmallest {
	public static void main(String[] args) {
		int arr[] = {4, 2, 6, 1, 5};
		int k = 3;
		for (int i = k; i < arr.length; i++) {
			int max_val = arr[k - 1];
			int pos = k - 1;
			for (int j = k - 2; j >= 0; j--) {
				if (max_val < arr[j]) {
					max_val = arr[j];
					pos = j;
				}
			}

			if (max_val > arr[i]) {
				int j = pos;
				while (j < k) {
					arr[j] = arr[j + 1];
					j++;
				}
				arr[k - 1] = arr[i];
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}

	}
}
