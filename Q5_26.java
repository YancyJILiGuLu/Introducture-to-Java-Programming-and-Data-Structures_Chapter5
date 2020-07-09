package chapter5;

public class Q5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=10000;n<=100000;n+=10000) {

			double ans=1.0;
			for(int i=1;i<=n;++i) {	
				double temp =1;
				for(int j=1;j<=i;j++) {
					temp*=1/j;
					ans+=temp;
				}


			}
			System.out.printf("when i is %d  e is %f\n",n,ans);
		}
	}

}
