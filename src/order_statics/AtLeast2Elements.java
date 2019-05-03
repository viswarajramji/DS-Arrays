package order_statics;

public class AtLeast2Elements {
	static void process_values_find(int arr[]) {
		int first, second;
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x > first) {
				second = first;
				first = x;
			} else if (x > second) {
				second = x;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < second) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, -6, 3, 5, 1}; 
		process_values_find(arr);
	}
}
