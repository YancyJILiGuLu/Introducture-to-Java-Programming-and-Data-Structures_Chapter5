package chapter5;

public class Q6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s\t%s\t%s\t%s\n",
				"Foot","Meter","Meter","Foot");
		
		System.out.printf("------------------------------------------------\n");
		
		for (int i=1;i<11;i++) {
			
			double a=i;
			System.out.printf("%.1f \t",a);
			System.out.printf("%.3f \t\t",footTometer(a));

		
		
			double k=((i-1)*5)+20;
			
			System.out.print(k+"\t\t");
			System.out.printf("%.1f\t",MeterToFood(k));
			System.out.print("\n");
		}
		
		}
	
	
	public static double footTometer(double foot) {
		// TODO Auto-generated method stub
		double result=0;
		result=0.305*foot;
		return result;
	}

	public static double MeterToFood(double meter) {
		// TODO Auto-generated method stub

		double result;
		result=3.279*meter;
		return result;
	}
	

}
