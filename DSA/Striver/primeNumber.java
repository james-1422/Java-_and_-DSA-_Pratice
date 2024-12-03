package DSA.Striver;

public class primeNumber {
	public  static boolean isPrime(int n ){
		if(n == 1) return false;
//		int sqrt = (int)Math.sqrt(n);
		for(int i =2; i<= (int)Math.sqrt(n); i++){
			if(n%i== 0) return false;
		}
		return true;
	}

//	public static void main(String[] args) {
//		boolean ans = isPrime(4);
//		System.out.println(ans);
//	}
}
