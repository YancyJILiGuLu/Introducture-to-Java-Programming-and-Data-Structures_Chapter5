package chapter5;

import java.util.Scanner;

public class Q5_31 {

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
		System.out.printf("Month\tCD Value\n");
		
		for (int i=1;i<=months;i++) {
			amount=amount*(1+monthlyInterestRate);	
			System.out.printf("%d\t",i);
			System.out.printf("%.2f\n",amount);
		
		
		}

	}

}
