package order_statics;

import java.util.PriorityQueue;

public class ContigousSubarry {
	static int  process_arr(int arr[],int k) {
		int n = arr.length;
		int sum[] = new int[n + 1];
		sum[0] = 0;
		sum[1] = arr[0];
		for (int i = 2; i <= n; i++) {
			sum[i] = arr[i - 1] + sum[i - 1];
		}

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				int x =sum[i]-sum[i-1];
				if(q.size()<k) {
					q.add(x);
				}
				else {
					if(q.peek()<x) {
						q.poll();
						q.add(x);
					}
				}
			}
		}
		return q.poll();

	}

	public static void main(String[] args) {
		int arr[] ={ 10, -10, 20, -40 }; 
		int k=6;
		System.out.println(process_arr(arr,k));
	}
}
