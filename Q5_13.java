package chapter5;

public class Q5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int n=0;
		while (x<12000) {
			n+=1;
			x= (int) Math.pow(n, 3);
			
			
		}
		System.out.print(n-1);


	}

}
