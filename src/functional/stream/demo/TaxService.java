package functional.stream.demo;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String taxEligible) {
        return
                (taxEligible.equalsIgnoreCase("tax")) ?

                        Database.getEmployee()
                                .stream()
                                .filter(employee -> employee.getSalary() > 500000)
                                .collect(Collectors.toList())
                        :

                        Database.getEmployee()
                                .stream()
                                .filter(employee -> employee.getSalary() < 500000)
                                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("tax"));
    }
}
