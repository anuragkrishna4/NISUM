public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();

        controller.handleRequest(1); 
        controller.handleRequest(-5);  
    }
}
