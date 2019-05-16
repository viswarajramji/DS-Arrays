package Revise;

import java.util.Collections;
import java.util.PriorityQueue;

public class Compute_Values {
	public static void main(String[] args) {
		int A[] = { 4, 2, 5, 1 };
		int B[] = { 8, 0, 5, 3 };
		int k = 3;
		PriorityQueue<Integer> prio = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				prio.add(A[i] + B[j]);
			}
		}

		int j = 0;
		while (j < k) {
			System.out.println(prio.poll());
			j++;
		}

	}
}
