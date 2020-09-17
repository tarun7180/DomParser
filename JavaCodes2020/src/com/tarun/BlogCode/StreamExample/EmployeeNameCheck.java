package com.tarun.BlogCode.StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeNameCheck {

    public static void main(String[] args) {
        EmployeeNameCheck employeeNameCheck = new EmployeeNameCheck();
        List<Employee> employeeList = employeeNameCheck.getEmployeeList();
        Boolean nameFlag = employeeList.stream().anyMatch(employee -> employee.getEmployeeFirstName().equals("ABC"));
        System.out.println("nameFlag for ABC >> " + nameFlag);
        if (nameFlag) {
            Optional<Employee> optionalEmployee = employeeList.stream()
                .findAny()
                .filter(employee -> employee.getEmployeeFirstName().equals("ABC"));
            if (optionalEmployee.isPresent()) {
                System.out.println("Employee Id present >> "+ optionalEmployee.get().getEmployeeId());
            }
        }
        nameFlag = employeeList.stream().anyMatch(employee -> employee.getEmployeeFirstName().equals("PQR"));
        System.out.println("nameFlag for PQR >> " + nameFlag);
        Boolean empIdFlag = employeeList.stream().anyMatch(employee -> employee.getEmployeeId().equals(4L));
        System.out.println("empIdFlag 4 >>" + empIdFlag);
        empIdFlag = employeeList.stream().anyMatch(employee -> employee.getEmployeeId().equals(4L));
        System.out.println("empIdFlag 1 >>" + empIdFlag);
    }

    private List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1L, "ABC", 10));
        employeeList.add(new Employee(2L, "DEF", 22));
        return employeeList;
    }
}
