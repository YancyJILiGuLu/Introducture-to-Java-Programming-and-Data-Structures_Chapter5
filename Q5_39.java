package chapter5;

public class Q5_39 {
	public static void main(String[] args) {
		double  goal= 30000;
		double  goalSubBasic=30000-5000;
		double rate=0;
		double ans=0;


		for(int j=8;j<=12;j+=2) {
			rate=5000*(j/100.00);
			goalSubBasic-=rate;
			
		}
		ans=goalSubBasic/(12/100.00);
		System.out.print(ans);


	}
}
