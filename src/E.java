
public class E {

	static int stationCnt;
	static int[][] map;
	static int[] exchangeTime;
	static int[] visited;
	
	public static int solve (int sc, int[][] m, int[] et, int dp, int ap) {
		stationCnt = sc;
		exchangeTime = et;
		map = m;
		visited = new int[stationCnt]; 
		
		return getTime(dp, ap);
	}
	
	public static int getTime(int dp, int ap) {
		System.out.println("dp = " + dp + "-> ap = " + ap);
		if (dp == ap)	return 0;
		if (visited[dp] == 1)	return -1;

		int time = 1000000;
		
		
		visited[dp] = 1;
		int[] nexts = map[dp];
		
		for (int i = 0; i < stationCnt; ++i) {
			if ((nexts[i] != 0) && (visited[i] == 0)) {
				int newTime = getTime(i, ap);
				System.out.println("newTime = " + newTime);
				if (newTime != -1) {
					newTime += map[dp][i];
					if () {// in case of transfer
						newTime += exchangeTime[i];
					}
					
					time = Math.min(time, newTime);
					System.out.println("changed Time = " + time);
				}
			}
		}
		
		return time;
	}
	
}
