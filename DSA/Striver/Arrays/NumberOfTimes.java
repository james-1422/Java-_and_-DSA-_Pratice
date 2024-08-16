package DSA.Striver.Arrays;

public class NumberOfTimes {
	public static void printX(int X, int N) {

		if(N < 0){
			System.out.println("Invalid number of Times");
			return;
		}
		for(int i =0; i < N; i++){
			System.out.print(X);
			if(i< N-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printX(-5,4);
	}
}
