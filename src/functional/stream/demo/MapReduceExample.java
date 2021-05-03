package functional.stream.demo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 3, 7, 50, 6, 9);
        List<String> maxString = Arrays.asList("core_java", "spring_framework", "hibernate", "web_socket", "learning_react", "leaning_redux", "learning_angular");
        int sum = 0;
        for (int no : numbers
        ) {
            sum += no;
        }
//        System.out.println(sum);

        Double sum1 = numbers.stream()
                .mapToDouble(i -> i).sum();
//        System.out.println(sum1);

        Integer reduce = numbers.stream()
                .reduce(0, (a, b) -> a + b);
//        System.out.println(reduce);

        Optional<Integer> reduce1 = numbers.stream()
                .reduce(Integer::sum);
//        System.out.println(reduce1.get());

        Integer multiResult = numbers.stream()
                .reduce(1, MapReduceExample::apply);
//        System.out.println(multiResult);

        Integer multiReduce = numbers.stream()
                .reduce(1, (a, b) -> a * b);
//        System.out.println(multiReduce);

        /*Stream<Object> maxValue = numbers.stream().map(i -> i>0 ? (i*i) : (i*2));
        System.out.println(maxValue.findFirst());*/

        Integer maxValue = numbers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
//        System.out.println(maxValue);

        Integer maxValueMethodRef = numbers.stream()
                .reduce(Integer::max).get();
//        System.out.println(maxValueMethodRef);

        Integer minValueMethodRef = numbers.stream()
                .reduce(Integer::compareTo).get();
//        System.out.println(minValueMethodRef);

        String reduce2 = maxString.stream()
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .get();
//        System.out.println(reduce2);

        List<String> gradeAEmployee = EmployeeDatabase.getAllEmp().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(emp -> "Name: " + emp.getName() + " Salary: " + emp.getSalary())
                .collect(Collectors.toList());

//        System.out.println(gradeAEmployee);

        Double averageSalary = EmployeeDatabase.getAllEmp().stream()
                .filter(grade -> grade.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();


        System.out.println(new DecimalFormat("##.##").format(averageSalary));

        Double sumSalary = EmployeeDatabase.getAllEmp().stream()
                .filter(grade -> grade.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();

        System.out.println(sumSalary.doubleValue());
    }

    private static Integer apply(Integer a, Integer b) {
        return a * b;
    }
}
