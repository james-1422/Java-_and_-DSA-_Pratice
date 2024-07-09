package DSA.LinearSearch;

public class MaxIn2Darr {
    static int Max(int[][] arr){
        int maxVal = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > maxVal) {
                    maxVal = element;
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {34,2,45},
                {23,99,65},
                {4,6,2}
        };
        int ans = Max(arr);
        System.out.println(ans);
    }
}
