package Contigeous;

public class StockPrice {
	static void compute_stock_price(int arr[]) {
		int n = arr.length;
		int max_price = arr[n - 1];
		int profit[] = new int[n];
		for (int i = 0; i < n; i++)
			profit[i] = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (max_price < arr[i]) {
				max_price = arr[i];
			}
			profit[i] = Math.max(profit[i + 1], max_price - arr[i]);
		}
		int min_value = arr[0];
		for (int i = 1; i < n; i++) {
			if (min_value > arr[i]) {
				min_value = arr[i];
			}
			profit[i] = Math.max(profit[i - 1], profit[i] + (arr[i] - min_value));
		}

		System.out.println(profit[n - 1]);
	}

	public static void main(String[] args) {
		int arr[] = {10, 22, 5, 75, 65, 80};
		compute_stock_price(arr);
	}
}
