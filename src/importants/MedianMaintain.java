package importants;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianMaintain {
	public static void main(String[] args) {
		int arr[] ={5, 15, 10, 20, 3}; 
		int med = arr[0];
		PriorityQueue<Integer> prio_S = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> prio_G = new PriorityQueue<Integer>();
		System.out.println(med);
		prio_S.add(med);
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			if (prio_S.size() > prio_G.size()) {
				if (x > med) {
					prio_G.add(x);
				} else {
					prio_G.add(prio_S.remove());
					prio_S.add(x);
				}
				med = (prio_G.peek() + prio_S.peek()) / 2;
			} else if (prio_G.size() == prio_S.size()) {
				if (x > med) {
					prio_G.add(x);
				} else {
					prio_S.add(x);
				}
			} else {
				if (x > med) {
					prio_S.add(prio_G.remove());
					prio_G.add(x);
				} else {
					prio_S.add(x);
				}
				med = (prio_G.peek() + prio_S.peek()) / 2;
			}
			System.out.println(med);
		}

	}
}
