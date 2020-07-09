package chapter5;
import java.util.Scanner;
public class Q5_41 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		int counter=0;
		int max=-10000;
		
		int i =-10000;
		while(i!=0) {
			System.out.print("Enter number :");
			i =input.nextInt();
			  
			if (i>max) {
				max=i;
				counter =1;	
			}	
			else if(i==max) {
				counter++;
			}
		}
		System.out.print("The largest number is :" + max);
		System.out.print("The occurrence count of the largest number is"
				+ " :" + counter);
		
	}

}
