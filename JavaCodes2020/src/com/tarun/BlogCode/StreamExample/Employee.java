package com.tarun.BlogCode.StreamExample;

public class Employee {

    private Long employeeId;

    private String employeeFirstName;

    private int monthsOfService;

    public Employee(final Long employeeId, final String employeeFirstName, final int monthsOfService) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.monthsOfService = monthsOfService;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(final String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(final Long employeeId) {
        this.employeeId = employeeId;
    }
}
