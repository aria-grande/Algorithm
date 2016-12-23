package hackersRank;

public class SherlockAndSquares {

	public static int numOfSquareInts(int A, int B) {
		
		if (A > B) return -1;
		
		return (int) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1);
	}
}
