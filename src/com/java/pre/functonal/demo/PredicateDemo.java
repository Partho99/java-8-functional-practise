package com.java.pre.functonal.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {


    //    Procedural way of coding
    @Override
    public boolean test(Integer integer) {
        if (integer % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

//    Functional way of coding

    static Predicate<Integer> predicate = t -> t % 2 == 0;


    public static void main(String args[]) {
        Predicate<Integer> predicateObject = new PredicateDemo();
        System.out.println(predicateObject.test(4));
        System.out.println(predicate.test(9));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 0);

//        list.stream().filter(predicate).forEach(t -> System.out.println(t));
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println(t));
    }
}
