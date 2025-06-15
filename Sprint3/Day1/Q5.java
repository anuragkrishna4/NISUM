import java.io.*;
import java.util.*;

public class Q5 {

    public static void readAndParseIntegers(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                System.out.println("Parsed number: " + num);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readAndParseIntegers("numbers.txt");
    }
}
