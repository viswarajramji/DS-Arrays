package rotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AmazonOptimized {
	public static void main(String[] args) {
		Integer val[] = { 8, 4, 6, 12 };
		List<Integer> list = new LinkedList<>(Arrays.asList(val));
		Collections.sort(list);
		int temp = list.get(0), min = 0;
		for (int i = 1; i < list.size(); i++) {
			min = min + (temp + list.get(i));
			temp=min;
		}
		System.out.println(min);
	}
}
