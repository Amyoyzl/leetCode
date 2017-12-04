package Math;

import java.util.Arrays;
import java.util.Scanner;

public class Permutations {

	int[] a; // 保存1-n的数组
	StringBuffer r = new StringBuffer(); // 保存结果
	int count = 0; // 结果数量

	//初始化数组
	public Permutations(int n) {  // n 为数组的个数
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
	}

	public void backtrack(int k) {
		if (k >= a.length) {
			count++;
			r.append(Arrays.toString(a) + "\n");
			return;
		}
		for (int i = k; i < a.length; i++) {
			swap(i, k);
			backtrack(k + 1);
			swap(i, k);
		}
	}

	private void swap(int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Permutations p = new Permutations(n);
		p.backtrack(0);
		System.out.println(p.r);
		System.out.println(p.count);
		in.close();
	}
}
