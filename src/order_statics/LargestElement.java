package order_statics;

public class LargestElement {
	static void find_max_3_numnber(int arr[]) {
		int first, second, third;
		first = second = third = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x > first) {
				third = second;
				second = first;
				first = x;
			} else if (x > second) {
				third = second;
				second = x;
			} else if (x > third) {
				third = x;
			} else {

			}
		}
		System.out.println("Max 3 of number");
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 3, 6, 8 };
		find_max_3_numnber(arr);
	}
}
