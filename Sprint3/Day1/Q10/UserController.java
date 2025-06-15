public class UserController {
    private UserService service = new UserService();

    public void handleRequest(int userId) {
        try {
            String user = service.fetchUser(userId);
            System.out.println("User found: " + user);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
