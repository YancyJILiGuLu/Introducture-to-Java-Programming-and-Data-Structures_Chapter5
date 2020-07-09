package chapter5;

public class Q5_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posCoubter=0;
		int negCoubter=0;
		for(int i=0;i<100;i++) {
			int a= (int) (Math.random()*10);
			if(a%2==0) {
				posCoubter++;

			}
			else {
				negCoubter++;
			}

		}
		System.out.printf("The chance gets head of a coin is: %d "
				+ "and the chance of gets a tails of a coin is :%d",posCoubter,negCoubter);
	}
}
