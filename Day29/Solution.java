package Day29;

import java.util.*;

public class Solution {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		Integer A, B;
		int AandB;
		
		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");
			
			int N = Integer.parseInt(nk[0]);
			
			int K = Integer.parseInt(nk[1]);
			
			// Find two integers, A and B (where A < B), from set S such that
			// the value of A&B is the maximum possible and also less than a given integer, K
			
			// test cases
			int max = 0;
			
			for(int i = 1; i < N; i++) {
				A = i;
				B = i+1;
				
				for(int j = 0; j < i; j++) {
					
				}
					AandB = A & B;
				
				System.out.print(AandB);
			}
			
			
		}
		
		scanner.close();
		
		
	}
}
