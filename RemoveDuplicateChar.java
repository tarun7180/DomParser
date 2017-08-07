import java.util.Scanner;

public class RemoveDuplicateChar {

	static String removeDuplicate(String s) {
		boolean[] flagArr = new boolean[122];
		int sLength = s.length();
		StringBuilder resultStr = new StringBuilder();
		for (int i = 0; i < sLength; i++) {
			char tempChar = s.charAt(i);
			int tempVal = (int) tempChar;
			if (!flagArr[tempVal]) {
				flagArr[tempVal] = true;
				resultStr.append(tempChar);
			}
		}
		return resultStr.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = removeDuplicate(s);
		if (!result.isEmpty()) {
			System.out.println(result);
		} else {
			System.out.println("Empty String");
		}
	}

}
