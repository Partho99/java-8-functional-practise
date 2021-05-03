package functional.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {



    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("98798756745", "45698712376")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("67546765342", "23473543244")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("45676598734", "23098123409")),
                new Customer(103, "kelly", "kelly@gmail.com", Arrays.asList("78123456781", "12098765987"))
        ).collect(Collectors.toList());
    }
}
