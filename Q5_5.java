package chapter5;

public class Q5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s\t%s\t%s\t%s\n","Kg","Lb","Lb","Kg");
		
		for(int i=1;i<=100;i++) {
			int kg1=i*2-1;
			double lb1=kg1*2.2;
			int lb2 =15+i*5;
			double kg2=lb2/2.2;
		
			System.out.printf("%d\t %.1f\t %d\t %.2f\n",kg1,lb1,lb2,kg2);
			
		}

	}

}
