package EmployeePredicateExample;

public class FinanceDepartmentPredicate implements EmployeePredicate {
    @Override
    public boolean test(final Employee employee) {
        return "finance".equals(employee.getDepartmentName());
    }
}
