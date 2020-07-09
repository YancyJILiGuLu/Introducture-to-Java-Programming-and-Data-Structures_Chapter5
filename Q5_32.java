package chapter5;

import java.util.Scanner;

public class Q5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotteryDigit1=(int)(Math.random()*10);
		
		int lotteryDigit2=(int)(Math.random()*10);
			while(lotteryDigit2==lotteryDigit1) {
				 lotteryDigit2=(int)(Math.random()*10);
			}
		int lottery =lotteryDigit1*10+lotteryDigit2;
		
		System.out.print("lot1 is "+lotteryDigit1+ "\n");
		System.out.print("lot2 is "+lotteryDigit2+ "\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(two  digits):");

		int guess = input.nextInt();
		int remainding = guess;
		int guessDigit1=remainding/10;
		remainding=remainding%10;
		int guessDigit2=remainding;
		
		
		System.out.printf("the lottery is : %d",lottery);

		if (guess==lottery) {
		System.out.println("Exact match!: you win $10 000");
		}
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 ==lotteryDigit2 ) {
			System.out.println("Digit matched!: you win $3 000");
		}
		
		
		else if (guessDigit1 == lotteryDigit1 ||guessDigit1 == lotteryDigit2 ||
				 guessDigit2 == lotteryDigit1 || 
				guessDigit2 == lotteryDigit2  )
			System.out.println("Match one digit,ypu win $1 000");
		else 
			System.out.println("Sorry, no match");

	}

}
