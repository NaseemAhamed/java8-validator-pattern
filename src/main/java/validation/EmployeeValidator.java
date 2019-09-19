package validation;

import exceptions.EmployeeException;
import model.Employee;

@FunctionalInterface
public interface EmployeeValidator {
    void validate(Employee employee) throws EmployeeException;
}
