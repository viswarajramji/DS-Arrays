package Revise;

public class MinimumDiff {
	public static void main(String[] args) {
		int arr[] =  {2, 5, 3, 5, 4, 4, 2, 3};
		int min_dis = Integer.MAX_VALUE;
		int x = 3;
		int y = 2;
		int prev = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x || arr[i] == y) {
				prev = i;
				break;
			}
		}
		for (int j = prev + 1; j < arr.length; j++) {
			if (arr[j] == x || arr[j] == y) {
				if (arr[j] != arr[prev] && min_dis > j - prev) {
					min_dis = j - prev;
					prev = j;
				} else {
					prev = j;
				}
			}
		}
		System.out.println(min_dis);
		
	}
}
