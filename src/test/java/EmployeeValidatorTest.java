import static org.junit.jupiter.api.Assertions.fail;

import exceptions.EmployeeException;
import model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validation.EmployeeValidator;
import validation.Java8Validator;

public class EmployeeValidatorTest {
    public EmployeeValidator validator = new Java8Validator();

    @Test
    public void testEmployee_underAge_ValidationFail() {
        try {
            validator.validate(new Employee("ABCD", "XYZ", -2, "test@gmail.com"));
            fail("Must throw invalid age exception");
        }
        catch (EmployeeException e) {
            Assertions.assertTrue(e.getMessage().equals("Please specify valid age"));
        }
    }

}
