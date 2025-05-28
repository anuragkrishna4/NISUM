import java.util.*;
import java.util.stream.*;

class Address {
    String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}

public class Q17 {
    public static void main(String[] args) {
        List<Address> addresses = Arrays.asList(
            new Address("Mumbai", "India"),
            new Address("Bangalore", "India"),
            new Address("New York", "USA"),
            new Address("Mumbai", "USA")
        );

        List<Address> sortedAddresses = addresses.stream()
            .sorted(Comparator.comparing((Address a) -> a.city)
                              .thenComparing(a -> a.country))
            .collect(Collectors.toList());

        sortedAddresses.forEach(System.out::println);
    }
}
