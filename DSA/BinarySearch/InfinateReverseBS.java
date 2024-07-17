package DSA.BinarySearch;

public class InfinateReverseBS {
	static int ans(int[] arr, int tar){
		// start with size of 2
		int start = 0;
		int end= 1;
			while(tar > arr[end]){
				int newStart = end +1 ;// new start value ;
				// Doubel the box value
				// end = previous end + sizeofthebox*2(end-start+1);
              end = end +( end - start + 1)*2;
			  start = newStart;
			}
			return BinarySsearch(arr,tar,start,end);
	}
	static int BinarySsearch(int[] arr, int trg , int start , int end){

		while(start <= end){

			int mid = start +(end - start) / 2;

			if(trg < arr[mid]){
				end = mid -1;
			}else if (trg > arr[mid]){
				start= mid+1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
int[] arr = {3,5,7,9,13,15,16,18,19,34,37,38,45,336};
int trg = 18;
		System.out.println(ans(arr,trg));
	}
}
