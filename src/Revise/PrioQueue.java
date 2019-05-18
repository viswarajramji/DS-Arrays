package Revise;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PrioQueue {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 3, 7 };
		PriorityQueue<Integer> prio = new PriorityQueue<>();
		for (int i : arr) {
			prio.add(i);
		}
		System.out.println(Arrays.toString(prio.toArray()));
	}
}
