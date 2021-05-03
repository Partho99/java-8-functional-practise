package com.java.pre.functonal.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerDemo{

    public static void main(String[] args){
       Consumer<Integer> consumer = (r) -> System.out.println("Printing  :  " + r);
        //consumer.accept(10);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 8, 7, 3);
//        list.stream().forEach(consumer);
        list.stream().forEach(t -> System.out.println(t));
    }
}