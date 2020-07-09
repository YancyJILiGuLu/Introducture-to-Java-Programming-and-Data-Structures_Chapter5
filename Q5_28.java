package chapter5;

import java.util.Scanner;

public class Q5_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a year :");
		int year = input.nextInt()
;
		System.out.print("Enter a number for weekday :"
				+ "(0-Sunday,1-Monday,2-Tuesday,3-Wednesday,4-Thurday,5-Firday,6-Satury,7-Sunday)");
		int weekday=input.nextInt();
		boolean isLeapYear=(year%4==0&& year%100==0)|| (year%400==0);
		String s="";
		int gap=0;
		String weekName="";
		for(int i=1;i<=12;i++) {
			switch(i-1) {
			case 0:gap=0;break;//gap between 1/1 and 1/1
			case 1:gap =31;break;//gap between 1/1 and 2/1
			case 2: if (isLeapYear) {
				gap=29;
			}
			else {
				gap=28;
			}//gap between 2/1 and 3/1
			break;
			case 3:gap =31;break;//gap between 3/1 and 4/1
			case 4:gap=30;break;//gap between 4/1 and 5/1
			case 5:gap =31;break;//gap between 5/1 and 6/1
			case 6:gap=30;break;//gap between 6/1 and 7/1
			case 7:gap =31;break;//gap between 7/1 and 8/1
			case 8:gap=31;break;//gap between 8/1 and 9/1
			case 9: gap = 30;break;//gap between 9/1 and 10/1
			case 10:gap=31;break;//gap between 10/1 and 11/1
			case 11:gap=30;break;//gap between 11/1 and 12/1
			
			}
			weekday +=gap;
			weekday=weekday%7;
			
			switch(weekday) {
			case 0: s= "Sunday";break;
			case 1:s ="Monday";break;
			case 2: s ="Tuesday";break;
			
			case 3:s ="wednesday";break;
			case 4:s ="Thuray";break;
			case 5:s ="Firday";break;
			case 6:s ="Saturday";break;
			
			}
			
			switch(i) {
			case 1:weekName ="January";break;
			case 2: weekName="Febuary";break;
			case 3:weekName ="March";break;
			case 4:weekName="Apirl";break;
			case 5:weekName ="May";break;
			case 6:weekName="June";break;
			case 7:weekName="July";break;
			case 8:weekName="August";break;
			case 9: weekName = "September";break;
			case 10:weekName="October";break;
			case 11:weekName="November";break;
			case 12:weekName="December";break;
			}
			
			System.out.println(weekName + "  1,  is  "+s+"\n");
			
		}
	}

}
