package chapter5;

public class Q5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.printf("%s\t%s\t%s\t%s\n","Mile","Kilometer","Kilometer","Mile");
		
		for(int i=1;i<=10;i++) {
			int mile1=i*2-1;
			double km1=mile1*1.609;
			int km2 =15+i*5;
			double mile2=km2/1.609;
		
			System.out.printf("%d\t%.3f\t\t %d\t\t %.3f\n",mile1,km1,km2,mile2);
			
		}

	}

}
