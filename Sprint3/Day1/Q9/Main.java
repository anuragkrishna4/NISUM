public class Main {
    public static void main(String[] args) {
        User user = new User("", "invalidemail", -5);

        UserValidator validator = new UserValidator();

        try {
            validator.validate(user);
            System.out.println("User is valid!");
        } catch (ValidationException e) {
            System.out.println("Validation failed:");
            for (String error : e.getErrors()) {
                System.out.println("- " + error);
            }
        }
    }
}
