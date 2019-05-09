package sorting;

public class CountInversion {
	static void perform_processing(int arr[]) {
		int temp[] = new int[arr.length];
		int cnt=do_operation(arr, temp,0,(arr.length-1));
		System.out.println(cnt);
	}

	static int do_operation(int arr[],int temp[],int low,int high) {
		int inversion_cnt=0;
		if(low<high) {
			int mid=(low+high)/2;
			inversion_cnt=do_operation(arr,temp,low,mid);
			inversion_cnt+=do_operation(arr,temp,mid+1,high);
			inversion_cnt+=compute_inversion(arr,temp,low,mid+1,high);
		}
		return inversion_cnt;
	}

	static int compute_inversion(int arr[], int temp[], int low, int mid, int high) {
		int inversion = 0;
		int i = low;
		int j = mid;
		int k = low;
		while (i <= mid - 1 && j <= high) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
				inversion+=(mid-i);
			}
		}

		while (i <= mid - 1) {
			temp[k++] = arr[i++];
		}

		while (j <= high) {
			temp[k++] = arr[j++];
		}

		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
		return inversion;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 20, 6, 4, 5 }; 
		perform_processing(arr);
	}
}
