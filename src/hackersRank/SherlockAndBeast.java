package hackersRank;

import java.util.Scanner;

public class SherlockAndBeast {
	public static void solve() {
		long t1 = System.currentTimeMillis();
		
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
       
        while (testCases > 0) {
            System.out.println(replace(s.nextInt()));
            
            --testCases;
        }
        
        s.close();
        
        long t2 = System.currentTimeMillis();
        System.out.println("time = " + (t2 - t1));
    }
    
    private static String replace(int n) {
        int a = 0, b = 0;
        StringBuilder ret = new StringBuilder();
        
        for (a = (n / 3); a >= 0; --a) {
            if ((( n - (3 * a)) % 5 ) == 0) {
                b = (n - (3 * a)) / 5;
                break;
            }
        }

        if ((a == -1) && (b == 0)) {
            return "-1";
        }
        
        // replace 3 to 555 and 5 to 33333
        for(; a > 0; --a) {
            ret.append("555");
        }
        for(; b > 0; --b) {
            ret.append("33333");
        }
        
        return ret.toString();
    }
}
