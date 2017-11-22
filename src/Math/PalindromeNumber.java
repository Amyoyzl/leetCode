package Math;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n = 1234321;
		System.out.println(isPalindrome(n));
	}

	public static boolean isPalindrome(int x) {
		Integer y = new Integer(x);
		String str = y.toString();
		int i;
		for (i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i))
				break;
		}
		if(i==str.length() / 2) return true;
		return false;
	}
}
