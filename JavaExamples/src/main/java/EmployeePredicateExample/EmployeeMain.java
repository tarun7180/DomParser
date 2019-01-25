package EmployeePredicateExample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "admin"));
		employeeList.add(new Employee(2, "admin"));
		employeeList.add(new Employee(3, "admin"));
		employeeList.add(new Employee(4, "admin"));
		employeeList.add(new Employee(5, "finance"));
		employeeList.add(new Employee(6, "finance"));
		employeeList.add(new Employee(7, "finance"));
		employeeList.add(new Employee(8, "finance"));
		employeeList.add(new Employee(9, "finance"));

		List<Employee> financeEmployeeList = filterEmployeesByDepartment(employeeList, new FinanceDepartmentPredicate());
		List<Employee> adminEmployeeList = filterEmployeesByDepartment(employeeList, new AdminDepartmentPredicate());

		System.out.println("Number of employees in finance department: " + financeEmployeeList.size());
		System.out.println("Number of employees in admin department: " + adminEmployeeList.size());
	}

	private static List<Employee> filterEmployeesByDepartment(final List<Employee> employeeList,
			final EmployeePredicate employeePredicate) {
		List<Employee> financeEmployeeList = new ArrayList<>();
		for (Employee employee : employeeList) {
			if (employeePredicate.test(employee)) {
				financeEmployeeList.add(employee);
			}
		}
		return financeEmployeeList;
	}
}
