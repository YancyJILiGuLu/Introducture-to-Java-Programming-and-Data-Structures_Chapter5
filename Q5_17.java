package chapter5;

import java.util.Scanner;

public class Q5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an number");
		int number = input.nextInt();
		for (int i=1;i<=number;i++) {
			for(int t=0;t<number-i;++t) {
				System.out.print(" ");
			}
				for(int a=i;a>=1;a--) {
					System.out.print(a);
				}
				for(int b=2;b<=i;b++) {
					System.out.print(b);
				}
				System.out.print("\n");
			}
		}
	}


