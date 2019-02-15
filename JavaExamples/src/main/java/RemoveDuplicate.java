package StreamsExamples;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String> testList = Arrays.asList("abcd","abcd","cdef","cdef","defg","defg","hhgf");
		
		System.out.println("Original list");
		testList.stream().forEach(System.out::println);
		
		
		System.out.println("List after removing duplicates");
		testList.stream().distinct().forEach(System.out::println);
	}

}
