package chapter5;

import java.util.Scanner;

public class Q5_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.print(" Enter a string :");
		String rev =" ";
		String enter =input.nextLine();
		
		for (int i=0;i<enter.length();i++) {
			rev = enter.charAt(i)+rev;
		}
		//return rev;
		System.out.print(rev);
	}

}
