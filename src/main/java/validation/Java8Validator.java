package validation;

import exceptions.EmployeeException;
import model.Employee;
import validation.genericvalidator.ValidatorUtil;

public class Java8Validator implements EmployeeValidator {

    @Override public void validate(Employee employee) throws EmployeeException {

        StringBuilder errorFields = new StringBuilder();
        errorFields.append(ValidatorUtil.notNullInteger.and(ValidatorUtil.greaterThanZero).test(employee.getAge())
            .getFieldNameIfInvalid("Please specify valid age").orElse(""));

        String errors = errorFields.toString();
        if (!errors.isEmpty()) {
            throw new EmployeeException(errors);
        }
    }
}
