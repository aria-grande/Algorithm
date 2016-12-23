package hackersRank;
import java.util.Arrays;


public class CutStick {
	public static void run(int size, String s_sticks) {
        String[] tmp = s_sticks.split(" ");
        if (size != tmp.length) {
            return ;
        }
        
        int[] sticks = new int[size];
        for (int i = 0; i < size; ++i) {
            sticks[i] = Integer.parseInt(tmp[i]);    
        }
        
        printNumOfSticksInCut(sticks);
	}
	
	private static int[] printNumOfSticksInCut(int[] sticks) {
        int slen = sticks.length;
        if (slen < 1) {
            return null;
        }
        System.out.println(slen);
        
        Arrays.sort(sticks);
        int min = sticks[0];
        int len = 0;
        for (int i = 0; i < slen; ++i) {
            sticks[i] -= min;
            if (sticks[i] > 0) ++len;
        }
        
        int[] ret = new int[len];
        int idx = 0, tmp;
        for (int j = 0; j < slen; ++j) {
            if ((tmp = sticks[j]) != 0) {
                ret[idx] = tmp;
                ++idx;
            }
        }
        
        return printNumOfSticksInCut(ret);
    }
}
