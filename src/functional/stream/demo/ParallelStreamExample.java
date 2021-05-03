package functional.stream.demo;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

      /*  start = System.currentTimeMillis();
        IntStream.range(1,100000000).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain Stream took time : "+ (end -start));

        System.out.println("====================================================");

        start = System.currentTimeMillis();
        IntStream.range(1,100000000).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain Stream took time : "+ (end -start));  */

        /*IntStream.range(1,10).forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });

        IntStream.range(1,10).parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });*/

        List<Employee> employees = EmployeeDatabase.getThousandEMp();
        start = System.currentTimeMillis();
        double salary = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal Stream execution time : " + (end - start) + " :: average salary: " + salary);

        start = 0;
        end = 0;

        start = System.currentTimeMillis();
        double salaryP = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("parallel Stream execution time : " + (end - start) + " :: average salary: " + salaryP);


    }
}
