package DSA.BinarySearch;

import java.util.Arrays;

// Ceiling is smallest number in the array greatre or equal to target;
public class CeliingOfNumber {
	static int CeilingBS(int[] arr, int trg) {
		if(trg > arr[arr.length-1]){
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (trg < arr[mid]) {
				end = mid - 1;
			} else if (trg > arr[mid]) {
				start = mid + 1;
			} else {
				return arr[mid];
			}
		}
		return arr[start];
	}
		public static void main (String[]args){
			int[] arr = {1,4,7,9,13,16,18,24,28,36,45,58,69,73};
			Arrays.sort(arr);
			int ans = CeilingBS(arr, 74);
			System.out.println(ans);
		}
}
