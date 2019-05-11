package searching;

public class equilibrium {

	static void find_index_equilirum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		int leftsum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum -= arr[i];
			if (leftsum == sum) {
				System.out.println("Equilirum=" + i);
				return;
			}
			leftsum += arr[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		find_index_equilirum(arr);
	}
}
