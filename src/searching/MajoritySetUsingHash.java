package searching;

import java.util.HashMap;
import java.util.Map;

public class MajoritySetUsingHash {
	public static void main(String[] args) {
		int arr[] = {2, 2, 2, 2, 5, 5, 2, 3, 3};  
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int value = map.get(arr[i]);
				map.put(arr[i], value+=1);
			} else {
				map.put(arr[i], 1);
			}
		}
		boolean flag=false;
		for(Map.Entry<Integer, Integer> obj:map.entrySet()) {
			if(obj.getValue()>=(arr.length/2)) {
				System.out.println("Element Found "+obj.getKey());
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Element Not found");
		}
	}
}
