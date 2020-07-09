package chapter5;

import java.util.Scanner;

public class Q5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a integer"
				+ "(this program change decimal number to binary）:");
		int number = input.nextInt();
		int remainding=0;
		String s=" ";
		
			while(number>=1) {
				remainding=number%2;
				
				//s+=String.valueOf(remainding);
				s=String.valueOf(remainding)+s;
				number=number/2;
				
		}
			
		System.out.printf("%s", s); 
	}
}
