package chapter5;

public class Q5_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0;
		int number2=0;
		int count=0;
		for(int i=1;i<=7;i++) {

			number1=i;

			for(int k=1;k<=7;k++) {
				number2=k;

				System.out.printf("%d\t %d\n\n",i,k);
				count++;
				

			}

		}


		System.out.printf("The total number os all combination is  :"+ count);
		//dont match with the result from textbook
				// but I think I am doing  right
	}

}
