import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		
			System.out.println(isPalindrome(s.next()));
		}
	}
	public static boolean isPalindrome(final String input) {
		
		if (input == null || input.isEmpty()) {	return false; }
		
		final int len = input.length();
		final int mid = len / 2;

		for (int p1 = 0, p2 = len - 1; p1 < mid; ++p1, --p2) {
			if (input.charAt(p1) != input.charAt(p2)) {
				return false;
			}
		}
		return true;
	}
}
