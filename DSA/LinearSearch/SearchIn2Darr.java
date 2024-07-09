package DSA.LinearSearch;

import java.util.Arrays;

public class SearchIn2Darr {
    static int[] tdSearch(int[][] arr, int trg){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == trg){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{0,0};
    }


    public static void main(String[] args) {
        int [][] arr ={{1,2,3},
                {4,5,6},
                {0,9,1}
        };
        int trg =0;
        int[] ans = tdSearch(arr,trg);
        System.out.println(Arrays.toString(ans));
    }
}
