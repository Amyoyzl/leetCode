package Math;

public class ReverseInteger {

	public static void main(String[] args) {
		int n = -1563847412;
		System.out.println(reverse(n));
	}

	public static int reverse(int x) {
	    long reverse = 0;
		while (x != 0) {
			reverse = reverse * 10 + x % 10;
			if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
				reverse = 0;
				break;
			}
			x /= 10;
		}
		return (int)reverse;
	}
}
