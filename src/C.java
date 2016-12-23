import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int funcSize = s.nextInt();
		
		List<List<Integer>> rels = new ArrayList<List<Integer>>();
		for (int i = 0; i < funcSize; ++i) {
			
			int refSize = s.nextInt();
			List<Integer> rel = new ArrayList<Integer>();
			for (int j = 0; j <refSize; ++j) {
				rel.add(s.nextInt());
			}
			
			rels.add(rel);
		}
		
		System.out.println((isRemovable(rels) == true) ? "Yes" : "No");
		
	}
	
	public static boolean isRemovable(List<List<Integer>> rels) {
		// index of list + 1 is start func index
		int relSize = rels.size();
		boolean[] visited = new boolean[relSize]; 
		int[][] map = new int[relSize][relSize];
		
		for (int i = 0; i < relSize; ++i) {
			
		}
		
		return false;
	}
}
