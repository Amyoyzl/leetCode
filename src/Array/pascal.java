package Array;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {

		System.out.print("Please input a number:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] pascal = new int[n + 1][];
		for (int i = 0; i < pascal.length; i++) {
			pascal[i] = new int[i + 1];
			pascal[i][0] = 1;
			pascal[i][i] = 1;
			if (i > 1) {
				for (int j = 1; j < pascal[i].length - 1; j++) {
					pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
				}
			}
		}

		for (int[] row : pascal) {
			for (int col : row) {
				System.out.printf("%4d ", col);
			}
			System.out.println();
		}
		in.close();
	}

}
