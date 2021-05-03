package functional.stream.demo;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 60000,"A"));
        list.add(new Employee(177, "Bikash", "CIVIL", 50000,"C"));
        list.add(new Employee(178, "Bimal", "DEFENCE", 80000,"C"));
        list.add(new Employee(179, "Sourav", "CORE", 90000,"B"));
        list.add(new Employee(180, "Prakash", "SOCIAL", 120000,"A"));
        list.add(new Employee(181, "Sunder", "IT", 16000000,"A"));
        list.add(new Employee(176, "Nadella", "IT", 6560000,"A"));
        return list;
    }
}
