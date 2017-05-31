
public class ReversingString {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("hundred");
		int len = str1.length();
		for(int i=0,j=len-1;i<j;i++,j--) {
			char temp1 = str1.charAt(i);
			char temp2 = str1.charAt(j);
			str1.setCharAt(i, temp2);
			str1.setCharAt(j, temp1);
		}
		System.out.println(str1.toString());
	}

}
