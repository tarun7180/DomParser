package StreamsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCustomers {

	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("abcd",22,1234));
		customerList.add(new Customer("efgh",23,1234));
		customerList.add(new Customer("ijkl",24,1234));
		customerList.add(new Customer("mnop",28,1235));
		customerList.add(new Customer("qrst",28,1236));
		customerList.add(new Customer("uvwx",29,1237));
		customerList.add(new Customer("yzab",22,1234));
		customerList.add(new Customer("abcd",22,1234));
		customerList.add(new Customer("efgh",23,1234));
		customerList.add(new Customer("ijkl",24,1234));
		customerList.add(new Customer("mnop",28,1235));
		
		System.out.println("-----------------Before removing duplicates-------------------");
		
		customerList.stream().forEach(cust -> System.out.println(cust.getName()));
		
		List<Customer> newList = customerList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("-----------------After removing duplicates-------------------");
		
		newList.stream().forEach(cust -> System.out.println(cust.getName()));

	}

}
