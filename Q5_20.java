package chapter5;

public class Q5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_PRIMES;
		final int NUMBER_OF_PRIMES_PER_LINE=8;
		int count=0;
		int number =2;
		
		System.out.println("The perime numbers in the range of 2 and 1000 are:");
		
		while (count<1000) {
			boolean isPrime=true;
			for (int divisor =2; divisor <=number/2;divisor++) {
				if(number % divisor ==0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if(count %NUMBER_OF_PRIMES_PER_LINE ==0) {
					System.out.println(number);
				}
				else 
					System.out.print(number +" ");
			}
			number ++;
		}

	}

}
