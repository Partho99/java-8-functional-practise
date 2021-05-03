package com.java.pre.functonal.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "Hi Supplier";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierDemo();

        Supplier<String> functionalSupplier = () -> "Hi functional supplier";
        System.out.println(supplier.get());
        System.out.println(functionalSupplier.get());

        List<String> list = Arrays.asList("hi", "hello", "namaste", "thanks", "map", "filter");

        System.out.println(list.stream().findAny().orElseGet(functionalSupplier));
        System.out.println(list.stream().findAny().orElseGet(() -> "hello guys"));
    }
}
