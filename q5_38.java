package chapter5;

import java.util.Scanner;

public class q5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a integer:"
				+ "(this program change decimal number to Octal）");
		int number = input.nextInt();
		int remainding=0;
		String s=" ";
		int a=0;
		
			while(number>=1) {
				remainding=number%8;
				a=remainding;
				//s+=String.valueOf(remainding);
				s=String.valueOf(remainding)+s;
				number=number/8;
				
		}
			
		System.out.printf("%s", s);


	}

}
