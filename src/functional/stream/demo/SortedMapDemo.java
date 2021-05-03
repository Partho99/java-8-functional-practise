package functional.stream.demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            //System.out.println(s);
        }

        for (Integer i : map.values()) {
            //System.out.println(i);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        for (Map.Entry<String, Integer> l : list) {
            //System.out.println(l.getValue());
        }

        Collections.sort(list, (o1, o2) -> o1.getValue() - o2.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            //System.out.println(entry.getKey() + " -----" + entry.getValue());
        }


      /*  map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
       */

       /* Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return (int) (e1.getSalary() - e2.getSalary());
            }
          });
       */

        // Traditional approach
//        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return (int) (employee1.getSalary() - employee2.getSalary());
//            }
//        });

        //Functional approach
        Map<Employee, Integer> employeeMap = new TreeMap<>((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()));


        extracted(employeeMap);

        //System.out.println(employeeMap);
//        employeeMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)
//                        .reversed()))
//                .forEach(System.out::println);
       List<String> s =  Stream.of("a","b","c","d","e").collect(Collectors.toList());
       System.out.println(s);
    }

    private static void extracted(Map<Employee, Integer> employeeMap) {
        employeeMap.put(new Employee(176, "Roshan", "IT", 60000,"A"), 60);
        employeeMap.put(new Employee(177, "Bikash", "CIVIL", 50000,"B"), 50);
        employeeMap.put(new Employee(178, "Bimal", "DEFENCE", 80000,"C"), 80);
        employeeMap.put(new Employee(179, "Sourav", "CORE", 90000,"A"), 90);
        employeeMap.put(new Employee(180, "Prakash", "SOCIAL", 120000,"D"), 120);
        employeeMap.put(new Employee(181, "Sunder", "IT", 16000000,"A"), 16000);
        employeeMap.put(new Employee(176, "Nadella", "IT", 6560000,"B"), 6560);
    }
}
