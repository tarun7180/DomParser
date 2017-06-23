public class FindPattern {

	public static void main(String[] args) {
		String inputStr = "aabccbccdccdee";
		String patternStr = "ccd";
		boolean flag = false;
		int inputLen = inputStr.length();
		int pattLen = patternStr.length();
		char patChar = patternStr.charAt(0);
		for (int i = 0; i < inputLen - pattLen; i++) {
			if (inputStr.charAt(i) == patChar) {
				for (int j = 1; j < pattLen; j++) {
					if (patternStr.charAt(j) == inputStr.charAt(i + j)) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				break;
			}
		}

		if (flag) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
