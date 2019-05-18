package Revise;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KmostOccurance {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				map.put(arr[i], val + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		map = sortByValue(map);
		int i = 0;
		for (Integer val : map.keySet()) {
			if (i == 3)
				break;
			System.out.println(val + " " + map.get(val));
			++i;
		}

	}

	public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> values) {
		List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(values.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> a1, Entry<Integer, Integer> a2) {
				// TODO Auto-generated method stub
				if (a1.getValue() < a2.getValue())
					return 0;
				return -1;
			}
		});

		Map<Integer, Integer> maps = new LinkedHashMap<>();
		for (Map.Entry<Integer, Integer> entry : entries) {
			maps.put(entry.getKey(), entry.getValue());
		}
		return maps;
	}
}
