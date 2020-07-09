package chapter5;

import java.util.Scanner;

public class Q5_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string1:");
		String string1 =  input.nextLine();
		System.out.print("Enter a string2 :");
		String string2 =  input.nextLine();
		
		
		int length=string2.length();
		String ansS="";
		if(string1.length()<=string2.length()) {
		 length=string1.length();	
		 
		}
		
		//System.out.print(string1.length());
		for(int i=0;i<length;i++) {
			char	ch1i=string1.charAt(i);
			char	ch2i=string2.charAt(i);
			
			if(ch1i== ch2i ) {
				 ansS+=ch1i;

			}
			
		}
		System.out.printf("The common prefix is : %s"
				,ansS);

	}

}
