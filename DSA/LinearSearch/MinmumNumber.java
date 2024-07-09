package DSA.LinearSearch;

public class MinmumNumber {
    static int min(int[] arr){
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minValue ){
                minValue=arr[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] arr ={1,4,2,6,5,8,4,0,45,34,78,79};
        int ans = min(arr);
        System.out.println("min-Value is:"+ans);
    }
}
