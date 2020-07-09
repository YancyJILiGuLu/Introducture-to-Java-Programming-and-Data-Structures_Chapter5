package chapter5;

import java.util.Scanner;

public class Q5_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first 11 digits of an ISBN as  a string:");
		String number =  input.nextLine();
		int ans=0;
	
		if (number.length()==12) {
		for(int i=1;i<number.length()+1;i++) {
			int	chi=number.charAt(i-1)-'0';
			if(i %2==0) {
				ans+=3*chi;
			}
			else {
				ans += chi;
			}
			
		}
		int d13=10-ans%10;
		if (d13 ==10) {
			System.out.printf("%s%s",number,"0");
		}
		else 
			System.out.printf("%s %d",number,d13);
	}
		else 
			System.out.printf(" %s is a invalid input",number);
	}
	
}
