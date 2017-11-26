package String;

public class LongestCommenPrefix {

	public static void main(String[] args) {
		
		String[] m = {"qwer","qweh","qwrgs","qwgsd","qwvsdf"};
		System.out.println("result:"+solution(m));

	}

	private static String solution(String[] m) {
		if(m==null)
			return "";
		String prefix = m[0];
		for(int i = 1; i < m.length; i ++) {
			while(m[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if(prefix==null) return "";
			}
		}
		return prefix;
	}
	

}
