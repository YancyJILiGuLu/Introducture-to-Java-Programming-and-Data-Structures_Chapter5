package chapter5;

import java.util.Scanner;

public class Q5_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number for  commision-sought:");
		double  goal= input.nextDouble();
		double  goalSubBasic=goal-5000;
		
		double rate=0;
		double ans=0;
		int j=8;
		
		do {
			
			rate=5000*(j/100.00);
			goalSubBasic-=rate;
			j+=2;
			
		}while(j<=12);
		
		
		ans=goalSubBasic/(12/100.00);
		System.out.printf("In order to achive $ %.2f as a goal,"
				+ "need to get %.2f",goal,ans);

	}

}
