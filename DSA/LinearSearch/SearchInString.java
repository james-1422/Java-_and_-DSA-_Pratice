package DSA.LinearSearch;

public class SearchInString {
    static boolean strSearch(String str , char trg){
        if(str.length() == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            if (trg == str.charAt(i)) return true;
        }
        return false;
    }
    static boolean strSearch2(String str , char trg){
        if(str.length() == 0) return false;
        for (char ch : str.toCharArray()) {
            if (trg == ch) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String arr ="JonesSamuel";
        char trg ='i';
        boolean ans = strSearch(arr,trg);
        boolean ans1 = strSearch2(arr,trg);
        System.out.println("Found:"+ans);
        System.out.println("Found:"+ans1);
    }
}
