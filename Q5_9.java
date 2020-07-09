package chapter5;

import java.util.Scanner;

public class Q5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String nameEntered="";
		int scoreEntered;
		String topScoreName="";
		int topScore=0;		

		int secondScore=0;
		String secondScoreName="";

		System.out.printf("Enter the number of students:");
		int number = input.nextInt();

		for(int i=0;i<number;i++) {

			System.out.printf("Enter student's name:");
			nameEntered= input.next();
			System.out.printf("Enter student's score:");
			scoreEntered = input.nextInt();	

			if(scoreEntered <=secondScore && scoreEntered<topScore) {
				//do nothing
			}

			else if (scoreEntered >=secondScore && scoreEntered<topScore) {
				scoreEntered =secondScore;
				secondScoreName=nameEntered;

			}
			else if(scoreEntered >secondScore && scoreEntered>=topScore) {
				secondScore=topScore;
				secondScoreName=topScoreName;
				topScore=scoreEntered;
				topScoreName=nameEntered;
			}
			else {
				System.out.print("Invalid input");
			}
		}		

		System.out.print("The student with top score is:"+topScoreName+"\n");
		System.out.print("the top score is :"+topScore+"\n");
		System.out.print("The student with second score is:"
				+secondScoreName+"\n");
		System.out.print("the second score is :"+secondScore);


	}

}
