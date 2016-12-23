package google_codejam;
import java.util.ArrayList;


public class Google_codejam_2011_A {
	public int solution(ArrayList<String[]> list) {
		int time = 0;
		
		int lo = 1, lb = 1;
		int curPos = 0;
		String toPush = list.get(curPos)[0];
		
		int posO = 0;
		String[] io = findNextValue(list, "O", posO);
		
		int posB = 0;
		String[] ib = findNextValue(list, "B", posB);
		
		boolean ioIsNotNull = false, ibIsNotNull = false;
		boolean toPushIsChanged;
		int on, bn;
		
		while ((ioIsNotNull = (io != null)) || (ibIsNotNull = (ib != null))) {
			++time;
			// System.out.println("--" + time + "--, toPush = " + toPush);
			toPushIsChanged = false;
			
			if (ioIsNotNull) {
				on = Integer.parseInt(io[1]);
//				System.out.println("on = " + on);
				if (on > lo) {
					++lo;
//					System.out.println("move: " + (lo-1) + "->" + lo);
				}
				else if (on < lo) {
					--lo;
//					System.out.println("move: " + (lo+1) + "->" + lo);
				}
				else if ("O".equals(toPush)) {
//					System.out.println("push");
					System.out.println("toPushIsChanged = " + toPushIsChanged + ", curPos = " + curPos);
					io = findNextValue(list, "O", ++posO);
					toPushIsChanged = true;
				}
				else {
//					System.out.println("stay");
				}
			}
			
			if (ibIsNotNull) {
				bn = Integer.parseInt(ib[1]);
//				System.out.println("bn = " + bn);
				if (bn > lb) {
					++lb;
//					System.out.println("move: " + (lb-1) + "->" + lb);
				}
				else if (bn < lb) {
					--lb;
//					System.out.println("move: " + (lb+1) + "->" + lb);
				}
				else if ("B".equals(toPush)) {
//					System.out.println("push");
					System.out.println("toPushIsChanged = " + toPushIsChanged + ", curPos = " + curPos);
					ib = findNextValue(list, "B", ++posB);
					toPushIsChanged = true;
				}
				else {
//					System.out.println("stay");
				}
			}
			
			if (toPushIsChanged && (curPos < (list.size() - 1))) {
				toPush = list.get(++curPos)[0];
				System.out.println(curPos);
			}
		}
		
		return time;
	}
	
	private String[] findNextValue (ArrayList<String[]> list, String robot, int pos) {
		String[] ret = null;	// if there's no next value, return null
		for(int i = pos; i < list.size(); ++i) {
			String[] tmp = list.get(i);
			if (robot.equals(tmp[0])) {
				ret = tmp;
				break;
			}
		}

		return ret;
	}
	
}
