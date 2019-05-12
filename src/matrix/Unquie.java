package matrix;

import java.util.HashMap;
import java.util.Map;

public class Unquie {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 20 }, { 5, 6, 20, 25 }, { 1, 3, 5, 6 }, { 6, 7, 8, 15 } };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (map.containsKey(arr[i][j])) {
					int key = map.get(arr[i][j]);
					map.put(arr[i][j], key + 1);
				} else {
					map.put(arr[i][j], 1);
				}
			}
		}

		for (Map.Entry<Integer, Integer> obj : map.entrySet()) {
			if (obj.getValue() == 1) {
				System.out.println(obj.getKey());
			}
		}

	}
}
