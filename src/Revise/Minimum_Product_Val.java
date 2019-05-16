package Revise;

import java.util.PriorityQueue;

public class Minimum_Product_Val {
	public static void main(String[] args) {
		int arr[] = { 198, 76, 544, 123, 154, 675 };
		int k = 2;
		PriorityQueue<Integer> prio = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			prio.add(arr[i]);
		}
		int count = 0;
		int ans = 1;
		while (!prio.isEmpty() && count < k) {
			ans = ans * prio.poll();
			count++;
		}
		System.out.println("Product values : "+ans);
		
		
	}
}
