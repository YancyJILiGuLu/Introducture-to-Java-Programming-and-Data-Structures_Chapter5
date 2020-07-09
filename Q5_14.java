package chapter5;

import java.util.Scanner;

public class Q5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integer n1 and n2:");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int gcd=1;	
		if (n1<n2) {//make sure  n2 is the smaller number
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		
		for (int i=n2-1;i>1;i--) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
				break;
				
			}
			
		}
		System.out.print(gcd);
	}

}
