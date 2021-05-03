package functional.stream.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getAllEmp() {

        return Stream.of(
                new Employee(176, "Roshan", "IT", 60000, "A"),
                new Employee(177, "Bikash", "CIVIL", 50000, "B"),
                new Employee(178, "Bimal", "DEFENCE", 80000, "C"),
                new Employee(179, "Sourav", "CORE", 90000, "A"),
                new Employee(180, "Prakash", "SOCIAL", 120000, "D"),
                new Employee(181, "Sunder", "IT", 16000000, "A"),
                new Employee(176, "Nadella", "IT", 6560000, "B")
        ).collect(Collectors.toList());
    }

    public static List<Employee> getThousandEMp() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            employees.add(new Employee(i,"employee"+i,"dept"+i,Long.valueOf(new Random().nextInt(100*100)),"A"));
        }

        return employees;
    }
}
