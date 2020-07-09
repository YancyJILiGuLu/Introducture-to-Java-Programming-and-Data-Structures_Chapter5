package chapter5;

public class Q5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=101; i<=2100;i++) {
			
			boolean isLeapYear=(i%4==0&& i%100==0)|| (i%400==0);
			if(isLeapYear) {
				count++;

				if(count%10==0) 
					System.out.println(i);

				else 
					System.out.print(i+"\t");

			}
		}

	}

}


