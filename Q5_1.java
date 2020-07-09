package chapter5;

import java.util.Scanner;

public class Q5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int number;
		int posCount=0;
		int negCount=0;
		double total=0;
		double avg=0;
		
		do {
			System.out.print("Enter a integer (enter 0 for end):");	
			number = input.nextInt();
			
			if (number >0) {
				posCount ++; 			
			}
			else if (number < 0){
				negCount++;
			}
			
			total += number;
			
		} while (number != 0);
		
		
		avg=total/(posCount+negCount);
		
		System.out.printf("The number of positive is: %d\n",posCount);
		System.out.printf("The number of negative is: %d\n",negCount);
		System.out.printf("The total is :%.2f\n",total);
		System.out.printf("The average is: %.2f\n",avg);




	}

}
