package chapter5;

public class Q5_33 {
	public static void main(String[] args) {
	
		for( int number=1;number<=10000;number++) {
			int count=0;
			String s=" ";
			int sum=0;
			for (int i=1;i<=number;i++) {
				if (number%i==0) {
					//System.out.print(i+"\t");
					count++;
					s=s+String.valueOf(i)+"\t";
					sum+=i;
				};
				
			}
			if(count!=2 && sum/2==number) {
				System.out.print(number+" : \t");
				System.out.print(s+"\t");			
				System.out.print("\n");
			}
		}
	}
}
