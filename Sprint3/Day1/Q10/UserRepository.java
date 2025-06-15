public class UserRepository {
    public String getUserById(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Invalid user ID in Repository Layer");
        }
        return "User" + id;
    }
}
