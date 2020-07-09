package chapter5;

public class Q5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int rowidex=1;rowidex<9;rowidex++) {
			
			for (int i=0;i<9-rowidex;i++) {
				System.out.print("    ");
			}
			
			
			for(int i=0;i<rowidex-1;i++) {
				System.out.printf("%4d",(int)Math.pow(2, i));
			}
			for(int i=rowidex-1;i>=0;i--) {
				System.out.printf("%4d",(int)Math.pow(2, i));
			}
			System.out.print("\n");
		}

	}

}
