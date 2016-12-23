package shake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PlanAlcohol {

	static int[] plans;
	static boolean[] chosed;
	static int[] scores;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
		
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
		plans = new int[n];
		chosed = new boolean[n];
		scores = new int[n]; 
		
		temp = bfr.readLine().split(" ");
		for (int i = 0; i < n; ++i) {
			int score = Integer.parseInt(temp[i]);
			plans[i] = score;
			scores[i] = score;;
		}
		
		temp = bfr.readLine().split(" ");
		for (int i = 0; i < m; ++i) {
			int tmp = Integer.parseInt(temp[i]) - 2;
			if (tmp >= 0 && tmp <= plans.length -1) {
				plans[tmp] = 0;
				scores[tmp] = 0;
			}
		}
		
		Arrays.sort(scores);
		
		System.out.println(solve());
	}
	
	public static int solve() {
		int accm = 0;
		for(int i = scores.length - 1; i >= 0; --i) {
			int highscore = scores[i];
			int idxOfHighScore = findIdx(highscore);
			if (highscore > 0 && idxOfHighScore != -1 && isChoosable(idxOfHighScore)) {
				accm += highscore;
				chosed[idxOfHighScore] = true;
			}
		}
		
		return accm;
	}
	
	public static int findIdx(int highscore) {
		for (int i = 0; i < plans.length; ++i) {
			if (plans[i] == highscore)	return i;
		}
		
		return -1;
	}
	
	public static boolean isChoosable(int day) {
//		System.out.println("chosed-for day" + day);
//		for (int i = 0; i < chosed.length; ++i) {
//			System.out.print(chosed[i] +", ");
//		}
//		System.out.println();
//		System.out.println("plan-for day" + day);
//		for (int i = 0; i < plans.length; ++i) {
//			System.out.print(plans[i] +", ");
//		}
//		System.out.println();
		return (plans[day] > 0) && !(((day >= 2) && chosed[day-1] && chosed[day-2]) || (day>=1 && day <plans.length-1) && chosed[day-1] && chosed[day+1] || (day <= plans.length - 3)&&chosed[day+1]&& chosed[day+2]) ;
	}
	
}
