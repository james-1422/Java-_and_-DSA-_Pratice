package DSA.LinearSearch;

public class ReturnigElement {
        static int Linearsrh(int[] arr ,int trg){

            if (arr.length == 0) return -1;


            for(int ele : arr){
                if(ele == trg) return ele;
            }
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i] == trg){
//                    return arr[i];
//                }
//            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr ={1,2,3,5,7,3,2,8};
            int trg = 8;
            int ans=   Linearsrh(arr,trg);
            System.out.println("found:"+ans);
        }
    }

