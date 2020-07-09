package chapter5;

public class Q5_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double n=50000;
		double sum1 =0;
		double sum2 =0;

		for(int i=1;i<=50000;i++) {			
			sum1 +=1.0/i;		
		}
		for(int i=5000;i>0;i--) {
			sum2 +=1.0/i;
		}
		System.out.printf("The sum in the order of left to right is: %.3f\n"+
				"The sum in the order of right to left is: %.3f",sum1,sum2);

	}
}
