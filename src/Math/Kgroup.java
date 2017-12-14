package Math;

import java.util.Arrays;

public class Kgroup {

	int[] num;
	int k;
	String r = "";
	int[] temp;
	int count;

	public Kgroup(int[] num, int k) {
		this.num = num;
		this.k = k;
		temp = new int[k];
	}

	private void backtrack(int n) {
		
		int len = num.length;
		int j = -1;
		if(n==0){
			len = num.length - k + 1;
		}
		else{
			for(j = 0; j < num.length; j++){
				if(num[j]==temp[n-1]) break;
			}
		}
		if (n >= k - 1) {
			for (int i = j + 1; i < num.length; i++) {
				count++;
				temp[n] = num[i];
				r += Arrays.toString(temp) + "\n";
			}
			return;
		}
		
		for (int i = j + 1; i < len; i++) {
			temp[n] = num[i];
			backtrack(n + 1);
		}
		
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		int k = 3;
		Kgroup kg = new Kgroup(n, k);
		kg.backtrack(0);
		System.out.println(kg.r);
		System.out.println(kg.count);
	}


}
