package functional.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customer = CustomerDatabase.getAll();
        return customer.stream()
                .filter( c -> c.getEmail().equals(email))
                .findAny().orElseThrow(() -> new Exception());
    }

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(101, "john", "abc@gmail.com", Arrays.asList("98798756745", "45698712376"));
        /* var empty = Optional.empty();
        System.out.println(empty);

        var email = Optional.of(customer.getEmail());
        System.out.println(email);*/


        Optional<String> email = Optional.ofNullable(customer.getEmail());
       /* if(email.isPresent()){
            System.out.println(email.get());
        }else {
            System.out.println("no .....");
        }*/

        /*System.out.println(email.orElse("email is not exist "));*/
        /*System.out.println(email.orElseThrow( () -> new NoSuchElementException("no such element")));*/

        System.out.println(email.map(String::toUpperCase).orElseGet(() -> "XYZ>EMAIL"));
        System.out.println(getCustomerByEmailId("john@gail.com"));
    }

}