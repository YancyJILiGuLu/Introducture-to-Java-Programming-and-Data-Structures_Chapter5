package chapter5;

import java.util.Scanner;

public class Q5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		final int NUMBER_OF_QUESTIONS=10;
		int correcCount=0;
		int count=0;
		long startTime=System.currentTimeMillis();
		String output="";
		
		while (count <NUMBER_OF_QUESTIONS) {
			int number1=(int) (1+ Math.random()*(15));
			int number2=(int) (1+ Math.random()*(15));
			
			
			System.out.print("What is "+ number1 + "+"+number2 +"?");
			int answer = input.nextInt();
			
			if (number1+number2==answer) {
				System.out.print("You are correct!");
				correcCount++;
			}
			else {
				System.out.print("You snawer is wrong!\n"+number1 + "+"+
			"number2 should be "+(number1+number2));
			}
			count ++;
			
			output +="\n"+ number1 +"+"+number2+ "="+
			answer +((number1+number2==answer)?"corect":"wrong");
			
		}
			long endTime =System.currentTimeMillis();
			long testTime=endTime-startTime;
			
		System.out.print("Correct count is"+ correcCount+
				"\n Test time is"+testTime/1000+"second\n"+output);	
	
	}

}
