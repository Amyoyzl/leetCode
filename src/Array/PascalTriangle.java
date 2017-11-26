package Array;

import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		int r = 6;
		List<List<Integer>> t = generate(r);
		for(List<Integer> e : t) {
			for(Integer m : e) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> generate(int numRows) {
		
		return null;    
    }
}
