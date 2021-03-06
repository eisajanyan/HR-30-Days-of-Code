package Day25;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int runs = input.nextInt();
		long num;
		boolean prime;
		
		while(runs > 0) {
			num = input.nextInt();
			prime = true;
			
			if(num == 1) {
				prime = false;
			}
			else if(num == 2) {
				prime = true;
			}
			else if(num == 3) {
				prime = true;
			}
			else if(num % 2 == 0) { // even number
				prime = false;
			}
			else {
			//  Given i <= sqrt(num)
				//  if(num % i == 0) then num is not prime
				for(long i = 2; i*i <= num; i++) {
					if(num % i == 0) {
						prime = false;
						break;
					}
				}
			}
			
			// output
			if(prime) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not prime");
			}
			
			runs--;
		}
		
	}
	
}
