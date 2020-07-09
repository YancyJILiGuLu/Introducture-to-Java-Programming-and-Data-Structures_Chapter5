package chapter5;

import java.util.Scanner;

public class Q5_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string:");
		String number =  input.nextLine();
		number=number.toUpperCase();
		int counterForVowel=0;
		int counterForSpace=0;
		int ans=0;
		for(int i=1;i<number.length()+1;i++) {
			char	chi=number.charAt(i-1);
			if(chi =='A'||chi =='E'||chi =='I'||chi =='O'||chi =='U') {
				counterForVowel++;

			}
			else if (chi ==' ') {
				counterForSpace++;
			}

		}

		int counterForC=number.length()-counterForVowel-counterForSpace;
		System.out.printf("The number of owels character is : %d\n"
				+ "The number of consonants %d",counterForVowel,counterForC);

	}

}
