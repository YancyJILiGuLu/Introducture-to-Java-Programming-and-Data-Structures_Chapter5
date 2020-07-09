package chapter5;

public class Q5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		for(int k=10000;k<=100000;k+=10000) {
			double pi=0;
			int i=1;
			while (i <=k) {
				pi+= 4*(Math.pow((-1), (i+1))/(2*i-1));					
				i ++;					
			}
			System.out.printf("when i equials to %d , pi is: %f \n",i-1,pi);
			
		}

	}
}
