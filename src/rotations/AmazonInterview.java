package rotations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AmazonInterview {
	public static void main(String[] args) {
		int arr[] = {8,4,2,12};
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
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
			Collections.sort(list,Collections.reverseOrder());
			int a=list.remove(list.size()-1);
			int b=list.remove(list.size()-1);
			int sum=a+b;
			list.add(sum);
			return sum+findMin(list);
		
		}
	}
}
