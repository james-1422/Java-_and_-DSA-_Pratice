package DSA.Striver.Arrays;

import java.util.Arrays;
import java.util.List;

public class sumOfFirstAndLast {
	public static int SumOfFirstAndLast(List<Integer> nums) {
		if (nums.isEmpty()){
			return 0;
		}
		return nums.getFirst() + nums.getLast();
	}


	public int sumOfFirstAndLasT(int[] nums) {
		if (nums.length == 0) {
			throw new IllegalArgumentException("The array cannot be empty.");
		}
		return nums[0] + nums[nums.length - 1];
	}
		public int SUMOfFirstAndLast(int[] nums) {
			int n = nums.length;
			for(int i=0; i<1;i++){
				for (int j = n-1; n-2 < j ; j--) {
					return nums[i]+nums[j];
				}
			}
			return 0;
		}


	public static void main(String[] args) {
		List<Integer> list = List.of(2, 2, 4, 1);
		int as = SumOfFirstAndLast(list);
		System.out.println(as);
	}
}
