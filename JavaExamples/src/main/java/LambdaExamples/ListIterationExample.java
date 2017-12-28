package LambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class ListIterationExample {
	public static void main(String args[]) {
		List<String> strList = new ArrayList<String>();
		strList.add("abcd");
		strList.add("efgh");
		strList.add("ijkl");
		strList.add("mnop");
		strList.add("qrst");
		strList.add("uvwx");
		strList.add("yz");
		strList.stream().forEach(System.out::println);
	}
}
