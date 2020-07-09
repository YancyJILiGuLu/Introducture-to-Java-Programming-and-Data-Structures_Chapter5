package chapter5;

import java.util.Scanner;

public class Q5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.print("Loan amount :");
		double amount  = input.nextDouble();
		System.out.print("Number of years :");
		int years = input.nextInt();

		// print title
		System.out.print("Interest Rate    Monthly Payment    Total Payment");
		
		System.out.print("\n");
		System.out.print(" " );
		double interestRate;
		double monthlyPayment=0;
		double totalPayment=0;
		// in the inset three for loop output the table
		for (int i =0;i<25;i++) {
			interestRate = (i *0.125 +5)/100;
			double montjlyInterestRate=interestRate/12;
			System.out.printf("%13.3f%% ", (interestRate*100));

			monthlyPayment=(amount * montjlyInterestRate)
					/(1-(1/Math.pow((1+montjlyInterestRate),(years*12))));
			System.out.printf("%15.2f     ",monthlyPayment);

			totalPayment=monthlyPayment *years *12;
			System.out.printf("%16.2f     ",totalPayment);
			System.out.print("\n");

			//interestRate=interestRate + 0.125;
			System.out.print("\n");
		}




	}

}
