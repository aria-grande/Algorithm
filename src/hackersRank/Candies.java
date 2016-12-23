package hackersRank;

import java.util.Scanner;

public class Candies {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int children = s.nextInt();
		int[] scores = new int[children];
		
		for (int i = 0; i < children; ++i) {
			scores[i] = s.nextInt();
		}
		
		System.out.println(getMinCandies(scores));
	}

	public static void increaseCandies(int[] candies, int[] scores, int from) {
		int i = from;
		
		while (i >= 0) {
			
			++candies[i];
			
			if (i > 0 && (scores[i-1] <= scores[i]))	break;
			if (i > 0 && scores[i-1] > scores[i] && candies[i-1] > candies[i])	break;
			--i;
		}
	}
	
	public static int getMinCandies(int[] scores) {
		
		int numOfChildren = scores.length;
		int[] candies = new int[numOfChildren];
		
		candies[0] = 1;
		for (int i = 1; i < numOfChildren; ++i) {
			if (scores[i-1] < scores[i]) {
				candies[i] = candies[i-1] + 1;
			}
			else {
				
				if (scores[i-1] > scores[i] && candies[i-1] == 1) {
					increaseCandies(candies, scores, i-1);
				}
				candies[i] = 1;
			}
			
			for (int j = 0; j < candies.length; ++j ) {
				System.out.print(candies[j] + ", ");
			}
			System.out.println();
		}
		
		return getNumOfCandies(candies);
	}
	
	public static int getNumOfCandies(int[] candies) {
		int num = 0;
		for (int i = 0; i < candies.length; ++i) {
			num += candies[i];
		}
		
		return num;
	}
}
