package order_statics;

public class print_small {

	static void print_small(int arr[], int k) {
		int n = arr.length;
		for (int i = k; i < n; i++) {
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
				while (j < k - 1) {
					arr[j] = arr[j + 1];
					j++;
				}
				arr[k - 1] = arr[i];
			}

		}
		
		for(int i=0;i<k;i++)
			System.out.println(arr[i]);
	}

	public static void main(String argc[]) {
		int[] arr = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 }; 
		int n = arr.length;
		int k = 5;
		System.out.println("hello");
		print_small(arr, k);
	}

}
