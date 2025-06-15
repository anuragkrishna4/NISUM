public class UserService {
    private UserRepository repository = new UserRepository();

    public String fetchUser(int id) throws Exception {
        return repository.getUserById(id);
    }
}
