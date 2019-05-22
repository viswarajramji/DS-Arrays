package Revise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.util.Pair;

public class MinimunSwaps {
	public static void main(String[] args) {
		int arr[] = {1, 5, 4, 3, 2};
		List<Pair<Integer, Integer>> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(new Pair<Integer, Integer>(arr[i], i));
		}
		Collections.sort(list, new Comparator<Pair<Integer, Integer>>() {
			@Override
			public int compare(Pair<Integer, Integer> arg0, Pair<Integer, Integer> arg1) {
				if (arg0.getKey() < arg1.getKey()) {
					return -1;
				} else
					return 1;
			}
		});

		int ans = 0;
		boolean vals[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (vals[i] || list.get(i).getValue() == i) {
				continue;
			}
			int count = 0;
			int j = i;
			while (!vals[j]) {
				vals[j] = true;
				j = list.get(j).getValue();
				count++;
			}

			if (count > 0)
				ans += (count - 1);
		}
		
		System.out.println(ans);

	}
}
