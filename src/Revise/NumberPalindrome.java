package Revise;

public class NumberPalindrome {
	public static void main(String[] args) {
		int arr[] ={11, 14, 15, 99};
		int i = 0;
		int j = arr.length - 1;
		int ans = 0;
		while (i < j) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else if (arr[i] < arr[j]) {
				i++;
				arr[i] += arr[i - 1];
				ans++;
			}else {
				j--;
				arr[j]=arr[j+1];
				ans++;
			}
		}
		System.out.println(ans);
	}
}
