package chapter5;

public class Q5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition =10000;
		int year=10;
		double tuitionAfterTenYears=0;
		double sum=0;
		for(int i=1;i<=year;i++) {
			tuition+=(tuition*0.05);
			System.out.printf("The Tuition of %d year(s)is :%.3f\n",
					i,tuition);
			
			 tuitionAfterTenYears=tuition;
					
		}
		for( int i=0;i<=4;i++) {
			 tuitionAfterTenYears+=( tuitionAfterTenYears*0.05);
			 
			 sum+=tuitionAfterTenYears;
			
			
			
		}
		System.out.printf("The Tuition of  four years after 10 years is :%.3f\n",
				sum);
		
		
		
	}

}
