package chapter5;

import java.util.Scanner;

public class Q5_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string:");
		String number =  input.nextLine();

		int counter=0;
		int counterForSpace=0;

		for(int i=1;i<number.length()+1;i++) {
			int	chi=number.charAt(i-1);
			if(chi <= 90 && chi >=65) {
				counter++;

			}
			
		}
		System.out.printf("The number of upper letters is : %d"
				,counter);
	}
}