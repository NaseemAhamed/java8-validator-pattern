package validation.genericvalidator;

import java.util.Optional;

public class GenericValidationResult {
    private boolean valid;

    GenericValidationResult(boolean valid) {
        this.valid = valid;
    }

    public static GenericValidationResult ok() {
        return new GenericValidationResult(true);
    }

    public static GenericValidationResult fail() {
        return new GenericValidationResult(false);
    }

    public boolean isValid() {
        return valid;
    }

    public Optional<String> getFieldNameIfInvalid(String field) {
        return this.valid ? Optional.empty() : Optional.of(field);
    }
}
