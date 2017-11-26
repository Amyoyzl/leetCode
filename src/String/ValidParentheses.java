package String;

public class ValidParentheses {

	public static void main(String[] args) {
		String st1 = "{[() {}]}";
		String st2 = "[(])[]";
		System.out.println(isValid(st1));
//		System.out.println(isValid(st2));
	}

	public static boolean isValid(String s) {
		char[] buffer = new char[s.length()/2];
		int i = 0, j = 0;
		for (i = 0; i < s.length(); i++) {
			if (isLeft(s.charAt(i))) {
				buffer[j] = s.charAt(i);
				System.out.println(s.charAt(i));
				j++;
			}
			else {
				if (isMatch(buffer[j-1], s.charAt(i))) {
					System.out.println("---");
					j--;
				}
				else {
					System.out.println("======");
					//	return false;
				}
			}
		}
		return true;
	}

	public static boolean isLeft(char c) {
		if (c == '(' || c == '[' || c == '{')
			return true;
		return false;
	}
	
	public static boolean isRight(char c) {
		if (c == ')' || c == ']' || c == '}')
			return true;
		return false;
	}

	public static boolean isMatch(char c1, char c2) {
		if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}'))
			return true;
		return false;
	}

}
