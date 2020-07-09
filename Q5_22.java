package chapter5;

import java.util.Scanner;

public class Q5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Loan amount :");
		double amount  = input.nextDouble();
		System.out.print("Number of years :");
		int years = input.nextInt();
		System.out.print("Annual interest Rate :");
		double AnnualInterestRate = input.nextInt();
		
		double monthlyInterestRate=AnnualInterestRate/1200;
		
		 double monthlyPayment=(amount * monthlyInterestRate)
				/(1-(1/Math.pow((1+monthlyInterestRate),(years*12))));
		 
		 double totalPayment =monthlyPayment *12;
		 System.out.print(" \n");
		 System.out.printf("Monthly Payment :\t%.2f\n",monthlyPayment);
		 System.out.printf("Total Payment :\t%.2f\n", totalPayment);
		 System.out.print(" \n");
		 System.out.print("Payment#      Interest      Pricipal         Balance \n");
		 for(int i=1;i<13;i++) {
			 System.out.printf("%d\t\t",i);
			 double interest=amount * monthlyInterestRate;
			 double Principal = monthlyPayment -interest;
			 double balance=amount -Principal;
			 amount=balance;
			 System.out.printf("%.2f\t\t",interest);
			 System.out.printf("%.2f\t\t",Principal);
			 System.out.printf("%.2f\t",balance);
			 System.out.printf("\n");
		 }
		 
		 

	}

}
