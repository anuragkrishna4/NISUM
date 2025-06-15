public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.processPaymentMethod("UPI", "OFF10");      
        service.processPaymentMethod("Cash", "OFF10");     
        service.processPaymentMethod("Card", "WRONG");     
    }
}
