package chapter5;

import java.util.Scanner;

public class Q5_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter   a string:");
		String number =  input.nextLine();
		int ans=0;


		for(int i=1;i<number.length()+1;i++) {
			char	chi=number.charAt(i-1);
			if(i %2!=0) {
				System.out.print(chi);
			}

		}

	}
}