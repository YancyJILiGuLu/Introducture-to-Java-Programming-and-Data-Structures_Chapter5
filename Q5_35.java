package chapter5;

public class Q5_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		double total=0;
		for(int i=1;i<=625;i++) {
			total+=1/(Math.sqrt(i)+(Math.sqrt(i+1)));
		}
		System.out.print(total);

	}

}
