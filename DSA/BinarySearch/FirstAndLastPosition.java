package DSA.BinarySearch;

import java.util.Arrays;

// Find first occurence of 7
public class FirstAndLastPosition {
	static int[] FirstAndLastNumBS(int[] arr, int trg){
		int[] ans ={-1,-1};
		//check for first occr
		int start=search(arr,trg,true);
		int end = search(arr,trg,false);
		ans[0]=start;
		ans[1]=end;
		return ans;
	}

static int search(int[] arr,int trg,boolean findStrartIndex){
		int ans =-1;
		//check for first occr
		int start = 0;
		int end= arr.length-1;
		while(start <= end){

			int mid = start +(end - start) / 2;

			if(trg < arr[mid]){
				end = mid -1;
			}else if (trg > arr[mid]){
				start= mid+1;
			}else{
				ans = mid;
				if(findStrartIndex){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[]arr={1,3,4,5,5,5,7};
		int trg =5;
		int[] ans=FirstAndLastNumBS(arr,trg);
		System.out.println(Arrays.toString(ans));
	}
}
