package hackersRank;

import java.util.Scanner;

public class TimeInWords {
	public static void getTime() {
		Scanner s = new Scanner(System.in);
		int hour = s.nextInt();
		int min = s.nextInt();
		
		System.out.println(timeConvert(hour, min));
		
		s.close();
	}
	
	public static String timeConvert(int hour, int min) {
		String time = "";
		
		String hourInWord = convertToWord(hour);
		String afterHour = convertToWord(hour + 1);
		
		// o' clock
		if (min == 0) {
			time = hourInWord + " o' clock";
		}
		// past
		else if (min == 15) {
			time = "quarter past " + hourInWord;	
		}
		else if (min == 30) {
			time = "half past " + hourInWord;	
		}
		else if ((min > 0) && (min < 30)) {
			time = convertToWord(min) + " minutes past " + hourInWord;
		}
		
		// to
		else if (min == 45) {
			time = "quarter to " + afterHour;
		}
		else if ((min > 30) && (min <= 59)){
			time = convertToWord(60 - min) + " minutes to " + afterHour;
		}
		
		if ((min == 1) || (min == 45)) {
			time = time.replaceAll("minutes", "minute");
		}
		
		return time;
	}
	
	private static String convertToWord(int n) {
		final String[] oneNums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		final String[] TenToNint = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		final String[] tenNums = {"twenty", "thirty", "fourty", "fifty"};
		
		String w = "";
		
		if ((n > 0) && (n < 10)) {
			w = oneNums[n];
		}
		else if (n < 20) {
			w = TenToNint[n % 10];
		}
		else {
			w = tenNums[n / 10 - 2] + " " + oneNums[n % 10];
		}
		
		return w;
	}
	
}
