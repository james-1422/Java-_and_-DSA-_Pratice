package DSA.BinarySearch;

public class BitonicMountainLC {
	static int BitonicSsearch(int[] arr){
		int start = 0;
		int end= arr.length-1;
		while(start < end){

			int mid = start +(end - start) / 2;

			if(arr[mid] > arr[mid +1]){
				// you are in dec part of array
				// this may be the ans but look at left
				// this is why end != mid -1
				end = mid;
			}else{
				// you are in asc part
				start= mid+1; // mid +  1 element >  mid element
			}
			// in the end , start == end and pointing to the largest number bcz of the 2 check above
			//hence when they are pointing to just one element that is the max one because that the checks says ;
			// more elobrationj at every point of time for start aand end they have the best possible answer till that time
			// and if we are saying that only item os remanning heance cuz of above line that is the best possible answer .
		}
		return start ;
	}
	public static void main(String[] args) {
		int[] arr = {3,5,7,9,13,15,16,18,16,15,13,12,9,7,5,3};
		System.out.println(BitonicSsearch(arr));
	}
}
