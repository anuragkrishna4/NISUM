import java.io.*;

public class Q4 {

    public static void legacyMethod() throws IOException {
        throw new IOException("Legacy IO error occurred");
    }

    public static void callLegacySafely() {
        try {
            legacyMethod();
        } catch (IOException e) {
            throw new UncheckedIOException("Wrapped IOException", e);
        }
    }

    public static void main(String[] args) {
        try {
            callLegacySafely();
        } catch (UncheckedIOException e) {
            System.out.println("Caught UncheckedIOException: " + e.getMessage());
        }
    }
}
