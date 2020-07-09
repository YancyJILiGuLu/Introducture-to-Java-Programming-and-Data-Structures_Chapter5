package chapter5;

import java.util.Scanner;

public class Q5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an number :");
		int number = input.nextInt();
		boolean isPrime=true;
		for (int i=1;i<=number;i++) {
			for( int divisor =2;divisor <= number/2;divisor++) {
				if(number%divisor ==0) {
					isPrime=false;
					break;
				}
				
				if(isPrime) {
					System.out.print(divisor);
				}
				
				
			}
		}

	}

}
