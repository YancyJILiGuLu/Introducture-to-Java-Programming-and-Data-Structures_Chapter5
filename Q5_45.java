package chapter5;

import java.util.Scanner;

public class Q5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		double sum=0;
		double sum2=0;
		double avg=0;
		double x=0;
		for(int i=1;i<11;i++) {
			System.out.print(" Enter a number :");
			double number =input.nextDouble();
			sum += number;
			sum2+=Math.pow(number, 2);
			
		}
		avg=sum/10;
		
		double p2=Math.pow(sum, 2)/10;
		double p3=(sum2-p2)/9;
		x=Math.pow( (p3), 0.5);
		System.out.printf("The mean is %.2f\n "
				+ "The standard deviation is %.5f",avg,x);
	}

}
