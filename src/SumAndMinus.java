import java.util.Scanner;


public class SumAndMinus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long st = System.currentTimeMillis();
		sumAndMin(s.nextInt(), s.nextInt());
		long et = System.currentTimeMillis();
		System.out.println(((et-st) / 1000) + "sec");
	}
	
	public static void sumAndMin(int a, int b) {
		
		System.out.println((a-b) + " " + (a+b));
	}
}
