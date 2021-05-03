package functional.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shakib al hasan");
        list.add("Jasprit Bumrah");
        list.add("Sourav ganguly");
        list.add("Virat kohli");
        list.add("Shoaib akter");
        list.add("Wasim akram");
        list.add("Hardik pandya");

//        traditional approach
        for (String s : list) {
            if (s.startsWith("S"))
                System.out.println(s);
        }
        list.stream().collect(Collectors.toList());
        System.out.println("<---------------------------------->");
        list.stream().filter(t -> t.startsWith("S")).forEach(t -> System.out.println(t));
        System.out.println("<---------------------------------->");

//        functional approach
        list.stream().forEach(item -> System.out.println(item));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((key, value) -> System.out.println(key + "  " + value));
        map.entrySet().forEach(t -> System.out.println(t));

        Consumer<String> consumer = t -> System.out.println(t);
        consumer.accept("hi there");

        for (String s : list) {
            consumer.accept(s);
        }

//        filter in map
        map.entrySet().stream().filter((k)-> k.getKey() % 2 == 0).forEach(r -> System.out.println(r));

    }
}
