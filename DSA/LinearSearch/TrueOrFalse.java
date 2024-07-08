package DSA.LinearSearch;

public class TrueOrFalse {
    static boolean Linearsrh(int[] arr ,int trg){

        if (arr.length == 0) return false;


        for(int ele : arr){
            if(ele == trg) return true;
        }
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i] == trg){
//                    return arr[i];
//                }
//            }
        return false;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,3,2,8};
        int trg = 8;
        boolean ans=   Linearsrh(arr,trg);
        System.out.println("found:"+ans);
    }
}
