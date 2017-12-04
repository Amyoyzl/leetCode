package Array;

public class Stock {

	public static void main(String[] args) {
		int[] p = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(p));
	}

	public static int maxProfit(int[] p) {
		int max = 0;
		int t = Integer.MAX_VALUE;
		for (int i = 0; i < p.length; i++) {
			if (p[i] < t)
				t = p[i];
			else if (p[i] - t > max)
				max = p[i] - t;
		}
		return max;
	}
}
