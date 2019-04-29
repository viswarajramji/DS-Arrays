package arrangements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
        arr.add("7"); 
        arr.add("776"); 
        arr.add("7"); 
        arr.add("7"); 
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				String XY = X + Y;
				String YX = Y + X;
				return XY.compareTo(YX) > 0 ? -1 : 1;

			}

		});

		Iterator<String> iter = arr.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}

	}
}
