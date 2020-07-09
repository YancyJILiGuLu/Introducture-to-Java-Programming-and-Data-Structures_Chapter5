package chapter5;

import java.util.Scanner;

public class Q5_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =" ";
		int remainding =0;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number :");
		int number = input.nextInt();
		
		int counter=0;;
		while(number >=1) {
			remainding=number % 2;
			s= String.valueOf(remainding)+s;
			counter++;
			number =number/2;
			

		}
		
		for(int i=counter;i<16;i++) {
			if (number >=0) {
				System.out.print("0");

			}
			else {
				System.out.print(1);
			}

		}
		System.out.print(s);
	}
}