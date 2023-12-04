package Java_8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        Stream<Integer> nonSortedNumbers = Arrays.asList(4, 8, 3, 1, 5, 2, 7, 3, 9).stream();


        // Intermediate Operations
        // such as `filter()`, `map()`, `flatMap()`, `distinct()`, `sorted()
        numbers.filter(integer -> integer > 5).forEach(System.out::print);

        System.out.println();

        System.out.print("sorted elements: ");

        // ========================Sorted======================================
        nonSortedNumbers.sorted().forEach(System.out::print);

        //Terminal Operation
        // such as `collect()`, `forEach()`, `reduce()`, `count()`, `min()`, `max()`, `anyMatch()`, `allMatch()`, `noneMatch()`

        Integer reduce = numbers1.reduce(0, (integer, integer2) -> integer + integer2);
        System.out.println(reduce);

        //min
        Optional<Integer> min = numbers1.min(Integer::compareTo);
        System.out.println(min.get());

        //max
        Optional<Integer> max = numbers1.max((o1, o2) -> o1.compareTo(o2));
        System.out.println(min.get());


        // ============= anyMatch =================================
        Stream<String> fruits = Stream.of("apple", "banana", "cherry", "date", "grape");
        boolean anyStartsWithB = fruits.anyMatch(fruit -> fruit.startsWith("b"));
        if (anyStartsWithB) {
            System.out.println("At least one fruit starts with 'b'.");
        } else {
            System.out.println("No fruit starts with 'b'.");
        }

        //============= allMatch =================================
        Stream<Integer> numbersAllMatch = Arrays.asList(2, 4, 6, 8, 10).stream();
        boolean allEven = numbersAllMatch.allMatch(num -> num % 2 == 0);
        if (allEven) {
            System.out.println("All numbers are even.");
        } else {
            System.out.println("Not all numbers are even.");
        }

        // ============= noneMatch =================================
        Stream<String> noneMatchFruits = Stream.of("apple", "banana", "cherry", "date", "grape");
        boolean noneStartWithZ = noneMatchFruits.noneMatch(fruit -> fruit.startsWith("z"));
        if (noneStartWithZ) {
            System.out.println("None of the fruits start with 'z'.");
        } else {
            System.out.println("At least one fruit starts with 'z'.");
        }


    }

}
