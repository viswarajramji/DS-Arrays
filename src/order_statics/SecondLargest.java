package order_statics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Temp {
	int num;
	int cnt;

	Temp(int num, int cnt) {
		this.num = num;
		this.cnt = cnt;
	}

	void increment() {
		this.cnt++;
	}

}

public class SecondLargest {
	static public void process_values(int arr[], int k) {
		Map<Integer, Temp> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (map.containsKey(x)) {
				map.get(x).increment();
				continue;
			}
			map.put(x, new Temp(x, 1));
		}

		// get all values
		List<Temp> list = new ArrayList<>();
		for (Integer key : map.keySet()) {
			list.add(map.get(key));
		}

		Collections.sort(list, new Comparator<Temp>() {

			@Override
			public int compare(Temp a, Temp b) {
				// TODO Auto-generated method stub
				return a.cnt < b.cnt ? 1 : -1;
			}

		});

		for (int i = 0; i < k; i++) {
			System.out.println(list.get(i).num + " " + list.get(i).cnt);
		}

	}

	public static void main(String[] args) {
		int arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
		int k = 4;
		process_values(arr, k);

	}
}
