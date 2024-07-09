package DSA.LinearSearch;

public class LCMaxWealth {
    static int maxVal(int[][]arr){

        int Max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int cntMax = 0;
            for (int anInt : ints) {
                cntMax += anInt;
            }
            if (cntMax > Max) Max = cntMax;
//            cntMax = 0;
        }
        return Max;
    }

    public static void main(String[] args) {
        int[][] arr ={
                {1,5},
                {7,3},
                {3,5}
        };
        int ans = maxVal(arr);
        System.out.println("Max Value:"+ans);
    }
}
