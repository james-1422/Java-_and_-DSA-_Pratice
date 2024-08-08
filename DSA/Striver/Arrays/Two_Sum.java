package DSA.Striver.Arrays;

import java.util.Arrays;

public class Two_Sum {
	public static int[] twosum(int arr[],int trg){
		int ans[] = new int[2];
		ans[0]=ans[1]=-1;
		for (int i = 0; i < arr.length-1 ; i++) {
			for (int j = i+1; j < arr.length-1 ; j++) {
				if((arr[i] + arr[j]) == trg){
					ans[0]=i;
					ans[1]=j;
					return ans;
//					return "YES"; // return tpye need to be String;
				}


			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] arr = {2, 6, 5, 8, 11};
		int target = 14;
		int[] ans = twosum(arr,target);
		System.out.println(Arrays.toString(ans));
	}
}
