package validation.genericvalidator;

public class ValidatorUtil {
    public static final Validation<Integer> greaterThanZero = GenericValidation.from(s -> s > 0);
    public static final Validation<Integer> notNullInteger  = GenericValidation.from(s -> s != null);
}
