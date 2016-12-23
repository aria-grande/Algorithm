
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		
		while(--testCases >= 0) {
			double ret = getAvg(s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble());
			System.out.println((ret != -1) ? ret : "NOT ATTENDED");
		}
	}
	
	public static double getAvg(double a, double b, double c, double d) {
		
		if (a == 0 || b == 0 || c == 0 || d == 0) {
			return -1;
		}

		double avg = (a + b + c + d) / 4;
		
		int int_avg = (int) avg;
		double dp = (avg - int_avg);
		
		avg = int_avg;
		
		if (dp >= 0.25 && dp < 0.75) {
			avg += 0.5;
		}
		else if(dp >= 0.75) {
			avg += 1;
		}
		
		return avg;
	}
}
