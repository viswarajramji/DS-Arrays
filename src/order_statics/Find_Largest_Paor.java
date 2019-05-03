package order_statics;

import java.util.PriorityQueue;

public class Find_Largest_Paor {
	static void process_values(int arr[], int k) {
		int n = arr.length;
		int sum[] = new int[n + 1];
		sum[0] = 0;
		sum[1] = arr[0];
		for (int i = 2; i <= n; i++) {
			sum[i] = arr[i - 1] + sum[i - 1];
		}
		PriorityQueue<Integer> prio = new PriorityQueue<Integer>();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				int x = sum[j] - sum[i - 1];
				if (prio.size() < k) {
					prio.add(x);

				} else {
					if (prio.peek() < x) {
						prio.poll();
						prio.add(x);
					}
				}
			}
		}
		System.out.println(prio.peek());
	}

	public static void main(String[] args) {
        int arr[] = { 10, -10, 20, -40 }; 
        int n = arr.length; 
        int k = 6; 
		process_values(arr, k);
	}
}
