package DSA.BinarySearch;

public class FloorOfNumber {
	static int FloorBS(int[]arr, int trg){
		int start = 0;
		int end = arr.length-1;
		while(start <= end){
			int mid= start + (end - start) /2 ;
			if(trg > arr[mid]){
				start = mid +1;
			} else if (trg < arr[mid]) {
				end  = mid - 1;
			}else{
				return mid;
			}
		}
		return arr[end];
	}

	public static void main(String[] args) {
		int[] arr ={1,2,3,4,13,16,19,24,26,27,35,38,45};
		int ans  = FloorBS(arr,5);
		System.out.println(ans);
	}
}
