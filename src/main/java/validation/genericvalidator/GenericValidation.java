package validation.genericvalidator;

import java.util.function.Predicate;

public class GenericValidation<K> implements Validation<K> {

    private Predicate<K> predicate;

    private GenericValidation(Predicate<K> predicate) {
        this.predicate = predicate;
    }

    public static <K> GenericValidation<K> from(Predicate<K> predicate) {
        return new GenericValidation<K>(predicate);
    }

    @Override public GenericValidationResult test(K param) {
        return predicate.test(param) ? GenericValidationResult.ok() : GenericValidationResult.fail();
    }
}
