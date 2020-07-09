package chapter5;

import java.util.Scanner;

public class Q5_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int computer=(int) (0+Math.random()*((2-0)+1));

		Scanner input = new Scanner (System.in);
		System.out.print("scissor(0),rock(1),paper(2):");

		int guess = input.nextInt();
		int countComputerWin=0;
		int countYouWin=0;

		//if (input.nextLine().equals(" ")) System.exit(0);//close input
		while(true) {
			int computer=(int) (0+Math.random()*((2-0)+1));
			if (computer ==1 && guess==1 ) {
				System.out.print("You are rock, "+"computer is rock, "+"it is a draw");
			}
			else if (computer ==2 && guess ==2) {
				System.out.print("You are paper, "+"computer is paper, "+"it is a draw");
			}
			else if (computer ==0 && guess ==0) {
				System.out.print("You are scissor, "+"computer is scissor, "+"it is a draw");
			}

			else if (computer ==2 && guess ==1) {
				System.out.print("You are rock, "+"computer is paper, "+"computer win");
				countComputerWin++;
			}
			else if (computer ==1 && guess ==0) {
				System.out.print("You are scissor, "+"computer is rock, "+"computer win");
				countComputerWin++;
			}
			else if (computer ==0 && guess ==2) {
				System.out.print("You are paper, "+"computer is scissor, "+"computer win");
				countComputerWin++;
			}
			else if (computer ==1 && guess ==2) {
				System.out.print("You are paper, "+"computer is rock, "+"you win");
				countYouWin++;
			}
			else if (computer ==0 && guess ==1) {
				System.out.print("You are rock, "+"computer is scissor, "+"you win");
				countYouWin++;
			}
			else if (computer ==2 && guess ==0) {
				System.out.print("You are scissor, "+"computer is paper, "+"you win");
				countYouWin++;
			}
			else 
				System.out.print("Error, invalid enter");



			if (countYouWin ==2 || countComputerWin ==2) {
				break;
			}
			else {
				System.out.print(" \n Try again; scissor(0),rock(1),paper(2):");

				guess = input.nextInt();
			}
		}

	}

}
