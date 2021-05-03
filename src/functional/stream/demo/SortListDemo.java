package functional.stream.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(9);

//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);

//        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));
        List<Employee> employees = Database.getEmployee();

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return (int) (employee2.getSalary() - employee1.getSalary());
//            }
//        });


//        Collections.sort(employees, (employee1, employee2) -> (int) (employee2.getSalary() - employee1.getSalary()));
//        System.out.println(employees);

//        employees.stream()
//                .sorted((employee1, employee2) -> (int) (employee2.getSalary() - employee1.getSalary()))
//                .forEach(System.out::println);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getDept))
                .forEach(System.out::println);
    }
}

class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return (int) (employee2.getSalary() - employee1.getSalary());
    }
}