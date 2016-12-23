package shake;

import java.util.Scanner;

public class Cow {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double t = s.nextInt() / (double)100;
		int n = s.nextInt();
		
		System.out.printf("%.2f", (double)n/(1+t));
	}
}
