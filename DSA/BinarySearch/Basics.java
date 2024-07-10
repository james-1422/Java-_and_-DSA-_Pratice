package DSA.BinarySearch;

import java.util.Arrays;

public class Basics {
    static int BinarySsearch(int[] arr, int trg){
        int start = 0;
        int end= arr.length-1;
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
int[] arr={12,33,23,43,25,35,2,23,535,34,234,46,7};
        Arrays.sort(arr);
int ans = BinarySsearch(arr,1);
        System.out.println(ans);
    }
}
