import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public void validate(User user) throws ValidationException {
        List<String> errors = new ArrayList<>();

        if (user.getName() == null || user.getName().trim().isEmpty()) {
            errors.add("Name must not be empty");
        }

        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            errors.add("Email must be a valid email address");
        }

        if (user.getAge() <= 0) {
            errors.add("Age must be greater than 0");
        }

        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }
    }
}
