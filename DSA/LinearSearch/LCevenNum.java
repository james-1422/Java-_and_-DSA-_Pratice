package DSA.LinearSearch;

public class LCevenNum {
    static int CountEven(int b){
        if(b < 0) b = b * -1;
        if(b == 0) return 1;
        int cont =0;
        while(b > 0){
            b=b/10;
            cont++;
        }
        return cont;
    }
    static int CountEven2(int b){
        if(b < 0) b = b * -1;

        return (int) (Math.log10(b)) + 1;
    }
    static boolean CheckEvens(int a){
       int counts = CountEven2(a);
       return counts % 2 == 0;
    }
    static int coutArrEvens(int[] arr){
        int count=0;
        for (int num : arr) {
            if(CheckEvens(num)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={12,27,3227,3371,742454,234123,37,347247,2343};
        int ans =coutArrEvens(arr);
        System.out.println(ans);
    }
}
