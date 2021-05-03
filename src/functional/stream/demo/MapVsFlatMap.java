package functional.stream.demo;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<String> email = CustomerDatabase.getAll()
                .stream()
                .map(t -> t.getEmail())
                .collect(Collectors.toList());

        List<List<String>> phoneNumbers = CustomerDatabase.getAll()
                .stream()
                .map(t -> t.getPhoneNumbers())
                .collect(Collectors.toList());

        System.out.println(phoneNumbers);

//        using data flattering and flat map
//        using flat map when data is nested e.g : nested list item etc
        List<String> singlePhoneNumbers = CustomerDatabase.getAll()
                .stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println(singlePhoneNumbers);
    }
}
