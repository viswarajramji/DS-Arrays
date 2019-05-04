package Contigeous;

public class MinimumDistance {
	static void process(int arr[], int x, int y) {
		int prev = -1;
		int i = 0;
		int min_dist = Integer.MAX_VALUE;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == x || arr[i] == y) {
				prev = i;
				break;
			}
		}
		for (; i < arr.length; i++) {
			if (arr[i] == x || arr[i] == y) {
				if (arr[prev] != arr[i] && (i - prev) < min_dist) {
					min_dist = i - prev;
				}
				prev = i;
			}
		}
		System.out.println("the min-distance : "+min_dist);
	}

	public static void main(String[] args) {
		int arr[] =  {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int x = 3; 
        int y = 6; 
		process(arr, x, y);
	}
}
