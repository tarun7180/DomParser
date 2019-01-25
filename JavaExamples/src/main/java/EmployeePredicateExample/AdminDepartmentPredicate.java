package EmployeePredicateExample;

public class AdminDepartmentPredicate implements EmployeePredicate {
    @Override
    public boolean test(final Employee employee) {
        return "admin".equals(employee.getDepartmentName());
    }
}
