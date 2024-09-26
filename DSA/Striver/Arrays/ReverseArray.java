package DSA.Striver.Arrays;

import java.util.Arrays;

public class ReverseArray {
	public static int[] reverse(int[] arr, int n) {
              int len = n/2;
			  int revLen = n-1;

			  for(int i=0; i< len; i++){
				  int temp = arr[i];
				  arr[i]= arr[revLen];
				  arr[revLen] = temp;
				  revLen--;
			  }
			  return arr;
	}
	public static void reverse1(int[] arr, int n) {
		int len = n/2;
		int revLen = n-1;
        int [] ans = new int[n];
		for(int i=0; i< len; i++){
			int temp = arr[i];
			arr[i]= arr[revLen];
			arr[revLen] = temp;
			revLen--;
		}
		for(int j=0; j<n; j++){
			ans[j] = arr[j];
			System.out.print(ans[j]+" ");
		}
	}


	public static void main(String[] args) {
		int n = 6;
		int[] arr = {1,2,1,1,5,1};
//		int [] ans = reverse(arr,n);
		reverse1(arr,n);
//		System.out.println(Arrays.toString(ans));
	}
}
