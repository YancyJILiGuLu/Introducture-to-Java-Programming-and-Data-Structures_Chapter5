package chapter5;

public class Q5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("figure 1");
		for(int i=1;i<7;i++) {
			System.out.print("\n");
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
		}
		
		System.out.print(" \n");
		System.out.print("\n");
		System.out.print("figure 2");
		for(int i=7;i>=1;i--) {
			System.out.print(" \n");
			for (int j=1;j<i;j++) {
				System.out.print(j);
			}
		}
		System.out.print(" \n");
		System.out.print("\n");
		System.out.print("figure 3");
		for(int i=1;i<7;i++) {
			System.out.print(" \n");
			for (int j=1;j<7-i;j++) {
				System.out.print(" ");
			}
			for (int j=i;j>=1;j--)
				System.out.print(j);
		}
		
		System.out.print(" \n");
		System.out.print("\n");
		
		System.out.print("figure 4");
		for(int i=7;i>=1;i--) {
			System.out.print(" \n");			
			for (int j=i;j<7-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j>i;j++) {
				System.out.print(j);
				
									
				
				}	
			}
			
				
		}
	}
	
	



