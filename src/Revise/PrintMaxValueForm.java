package Revise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PrintMaxValueForm {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("54");
		arr.add("546");
		arr.add("548");
		arr.add("60");

		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				// TODO Auto-generated method stub
				String xy = X + Y;
				String yx = Y + X;
				return (xy.compareTo(yx) > 0 ? -1 : 1);

			}
		});

		Iterator<String> iterator = arr.iterator();
		String out = "";
		while (iterator.hasNext()) {
			out += iterator.next();
		}
		System.out.println(out);
	}
}
