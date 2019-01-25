package EmployeePredicateExample;

public class Employee {
    private int code;

    private String departmentName;

    public Employee(final int code, final String departmentName) {
        this.code = code;
        this.departmentName = departmentName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(final String departmentName) {
        this.departmentName = departmentName;
    }
}
