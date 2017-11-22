package Array;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] m = new int[9];
		m[0] = 3;
		m[1] = 4;
		m[2] = 6;
		m[3] = 9;
		int[] n = { 2, 7, 11, 15, 16 };
		merge(m, 4, n, 5);
		System.out.println(Arrays.toString(m));

	}

	public static void merge(int[] A, int m, int[] B, int n) {
		// for(int i = m; i < m + n; i++) {
		// A[i] = B[i - m];
		// }
		// Arrays.sort(A);

		while (n > 0)
			A[m + n - 1] = (m == 0 || B[n - 1] > A[m - 1]) ? B[--n] : A[--m];
	}

}
