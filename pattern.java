import java.util.Scanner;
public class pattern {
	
	public static void printMatrix(int N) {		 
		for(int i = 0; i < 2 * N - 1; i++) {
			for(int j = 0; j < 2 * N - 1; j++) {
				System.out.print(1+Math.max(Math.abs(N-i-1), Math.abs(N-j-1)) );
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		printMatrix(number);
		
	}

}
