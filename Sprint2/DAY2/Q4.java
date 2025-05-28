public class Q4 {
    public static void main(String[] args) {
        String storeId = "23";
        String padded = String.format("%04d", Integer.parseInt(storeId));
        System.out.println("Padded storeId: " + padded);
    }
}
