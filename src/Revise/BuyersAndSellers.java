package Revise;

public class BuyersAndSellers {

	public static void process_values(int arr[]) {
		int n = arr.length;
		int max_val = arr[arr.length - 1];
		int profit[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			profit[i] = 0;
		}
		for (int i = n - 2; i >= 0; i--) {
			if (max_val < arr[i]) {
				max_val = arr[i];
			}
			profit[i] = Math.max(profit[i + 1], max_val - arr[i]);
		}
		int min_val = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min_val > arr[i])
				min_val = arr[i];
			profit[i] = Math.max(profit[i - 1], arr[i] - min_val + profit[i]);
		}
		
		System.out.println(profit[n-1]);
	}

	public static void main(String[] args) {
		int price[] = { 2, 30, 15, 10, 8, 25, 80 };
		process_values(price);
	}
}
