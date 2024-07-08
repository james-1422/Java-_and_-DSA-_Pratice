package DSA.LinearSearch;

public class Ranges {
    static boolean LinearsrhRange(int[] arr ,int trg , int start , int end){

        if (arr.length == 0) return false;


//        for(int ele : arr){
//            if(ele == trg) return true;
//        }
            for (int i = start; i < end; i++) {
                if(arr[i] == trg){
                    return true;
                }
            }
        return false;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,3,2,8};
        boolean ans=   LinearsrhRange(arr,5,1,4);
        System.out.println("found:"+ans);
    }
}
