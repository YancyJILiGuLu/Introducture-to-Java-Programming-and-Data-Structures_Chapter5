package chapter5;

import java.util.Scanner;

public class Q5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String name1 ="";
		int topScore=0;		
		int score;
		System.out.printf("Enter the number of students:");
		int number = input.nextInt();
		
		for(int i=0;i<number;i++) {
				
		System.out.printf("Enter student's name:");
		String name2 = input.next();
		System.out.printf("Enter student's score:");
		 score = input.nextInt();		
		if(score >topScore) {
			topScore=score;
			name1=name2;			
		}
			
	}
		System.out.print("The student with top score is:"+name1+"\n");
		System.out.print("the score is :"+topScore);

}
}
