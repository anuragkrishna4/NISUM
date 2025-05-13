class UserDetails {
    public String name;
    public int id;
    public String email;
    public String pass;
    private String creditCard;
    private double creditCardBalance;

    UserDetails(String name, int id, String email, String pass, String creditCard, double creditCardBalance) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.creditCard = creditCard;
        this.creditCardBalance = creditCardBalance;
    }
    public void display() {
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + id);
        System.out.println("Email: " + email);
    }
    public String getCreditcard() {
        return creditCard;
    }

    public double getCreditCardbalance() {
        return creditCardBalance;
    }

    public static void main(String[] args) {
        UserDetails user = new UserDetails("Anurag", 101, "anurag@gmail.com", "securePass123", "1234-5678-9012-3456", 5000.0);

        user.display();
    }
}
