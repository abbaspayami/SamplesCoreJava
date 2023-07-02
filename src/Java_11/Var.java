package Java_11;

import java.util.function.Predicate;

public class Var {

    public static void main(String[] args) {
        // Explicit type declaration
        Predicate<Integer> evenPredicate = (Integer num) -> num % 2 == 0;
        System.out.println(evenPredicate.test(4));  // Output: true

        // Using var for type inference in Java 11
        Predicate<Integer> oddPredicate = (var num) -> num % 2 != 0;
        System.out.println(oddPredicate.test(5));  // Output: true

        var riaz= "hello";
    }

}
