package LambdaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListPredicateMatchExample {

	public static void main(String args[]) {
		List<String> strList = new ArrayList<String>();
		strList.add("abcd");
		strList.add("efgh");
		strList.add("ijkl");
		strList.add("mnop");
		strList.add("qrst");
		strList.add("uvwx");
		strList.add("yz");
		
		Predicate<String> predicate = (s)-> s.length() > 2;
		System.out.println(strList.stream().allMatch(predicate));
	}
}
