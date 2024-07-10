package DSA.BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBS {
    static int BinarySearch(int[] arr, int trg){
        int start = 0;
        int end= arr.length-1;
        if(arr[start] < arr[end]) {
          return  AccendingSearch(arr,trg);
        }else{
          return  DecendingSearch(arr,trg);
        }
    }
    static int AccendingSearch(int[]arr, int trg){
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

    static int DecendingSearch(int[]arr,int trg){
        int start = 0;
        int end= arr.length-1;
        while(start <= end){

            int mid = start +(end - start) / 2;

            if(trg < arr[mid]){
                start= mid+1;
            }else if (trg > arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }




//    SECOND TYPE OF THE OABS
static int BinarySsearch(int[] arr, int trg){
    int start = 0;
    int end= arr.length-1;

    boolean isOABS = arr[start] < arr[end];

while(start <= end) {

    int mid = start +(end - start) / 2;

    if (arr[mid] == trg) {
        return mid;
    }

    if (isOABS) {
        if (trg < arr[mid]) {
            end = mid - 1;
        } else if (trg > arr[mid]) {
            start = mid + 1;
        }
    } else {
        if (trg < arr[mid]) {
            start = mid + 1;
        } else if (trg > arr[mid]) {
            end = mid - 1;
        }
    }
}
    return -1;
}

    public static void main(String[] args) {
int[]arr={1,4,3,6,2,7,33,8,3,74,6,4,5,7,56,6,5,35,544,66};
        Arrays.sort(arr);
 int[] arr1 ={12,11,10,9,8,7,6,5,4,3,2,1,0};
        int ans = BinarySsearch(arr,4);
        int ans1 = BinarySsearch(arr1,0);
        int answ = BinarySsearch(arr,4);
        int answ1 = BinarySsearch(arr1,0);

        System.out.println("T_1-ACC:"+ans);
        System.out.println("T_1-DEC:"+ans1);
        System.out.println("T_2-ACC:"+answ);
        System.out.println("T_2-DEC:"+answ1);
    }
}
