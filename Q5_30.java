package chapter5;

import java.util.Scanner;

public class Q5_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a amount :");
		double amount = input.nextDouble();
		
		
		System.out.print("Enter a yearly interest rate:");
		double yearlyinterestRate=input.nextDouble();
		
		System.out.print("Enter the number of months:");
		int months=input.nextInt();
		
		double monthlyInterestRate=yearlyinterestRate/1200;
		
		for (int i=1;i<=months;i++) {
			sum=(amount+sum)*(1+monthlyInterestRate);
			
		
		}
		System.out.printf("The amount after %d months is $ %.3f",months,sum);

	}

}
