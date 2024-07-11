package DSA.BinarySearch;

public class SmallestLetterLC {
static char	SmallestNum(char[] arr, char trg){
	int start = 0;
	int end = arr.length - 1;
	while (start <= end) {
		int mid = start + (end - start) / 2;
		if (trg < arr[mid]) {
			end = mid - 1;
		} else{
			start = mid + 1;
		}
	}
	return arr[start % arr.length];
}

	public static void main(String[] args) {
		char[] arr={'c','f','j'};
		char trg ='j';
		char ans = SmallestNum(arr,trg);
		System.out.println(ans);
	}
}


