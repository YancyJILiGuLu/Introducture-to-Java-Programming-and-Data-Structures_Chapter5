package chapter5;

import java.util.Scanner;

public class Q5_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int number =  input.nextInt();
		
		String s=" ";
		int digit=0;
		int sumOfOneToEight=0;
		int sumOfOneToNine=0;
		int digitOfnine=0;
		for(int i=8;i>=1;i--) {
			digit=(int) (number/Math.pow(10, i));
			number=((int) (number%Math.pow(10, i)));
			digitOfnine=number;
			sumOfOneToEight+=digit*(9-i);
			s+=String.valueOf(digit);
		}
		sumOfOneToNine=sumOfOneToEight+(digitOfnine*9);
		int dogit10 =sumOfOneToNine%11;
		if (dogit10==10)
			System.out.printf("The ISBN-10 number is:%s%d%s",
					s,digitOfnine,"x");
		else 
			System.out.printf("The ISBN-10 number is:%s%d%d",
					s,digitOfnine,dogit10);


	}

}
