package DSA.LinearSearch;

public class Basics {
    static int Linearizes(int[] arr , int trg){
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == trg){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,3,2,8};
        int trg = 8;
     int ans= Linearizes(arr,trg);
        System.out.println("found:"+ans);
    }
}
