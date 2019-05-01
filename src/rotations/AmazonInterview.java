package rotations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AmazonInterview {
	public static void main(String[] args) {
		int arr[] = { 1,2,5,10,35,89};
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		findMinValues(list);
	}

	static void findMinValues(List<Integer> list) {
		int min = findMin(list);
		System.out.println(min);
	}

	static int findMin(List<Integer> list) {
		if(list.size()==1) {
			return 0;
		}
		else {
			Collections.sort(list);
			int a=list.remove(0);
			int b=list.remove(0);
			int sum=a+b;
			list.add(sum);
			return sum+findMin(list);
		
		}
	}
}
