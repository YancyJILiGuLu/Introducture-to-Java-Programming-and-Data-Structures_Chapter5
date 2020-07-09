package chapter5;

public class Q5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		char ch= 33;
		//char ch2= 126;
		for (int i=33;i<=126;i++) {
			if(ch>=48 && ch <=57) {
				System.out.printf("\t%c",ch);
			}
			else {
			System.out.print(ch);
			}
			ch +=1;
			count++;
			if(count%10==0) {
			System.out.print("\n");
			
		}
	}

}
}
