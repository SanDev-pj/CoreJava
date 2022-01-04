package FUNCTIONAL_PROGRAMMING;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 9, 8, 4, 7, 10, 4, 5, 6, 7, 8, 9, 0);
        List<String> Courses = List.of("java", "Spring", "Python", "Flask", "Django", "REST", "Machine Learning");
        streamReduce(numbers,Courses);
        behaviorParameterization(numbers);
//        Supplier functional Interface (No input Return Something)
        System.out.println("Supplier for supply a random integer");
        Supplier<Integer> RandomIntegerSupplier=()->{
            Random random=new Random();
            return random.nextInt(1000);
        };
        System.out.println(RandomIntegerSupplier.get());
//        Unary operator Functional Interface
        UnaryOperator<Integer> unaryOperator=(x)->3*x;
        System.out.println(unaryOperator.apply(10));

    }

    public static void streamReduce(List<Integer> numbers, List<String> courses) {
        System.out.println("Adding items present in the list");

        BinaryOperator<Integer> sum = Integer::sum;
        BinaryOperator<Integer> sum2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        System.out.println(numbers.stream().reduce(0, sum2));
        System.out.println("Finding Maximum no in a list");
        System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y));
        System.out.println("Finding Minimum no in a list");
        System.out.println(numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y));
        System.out.println("Square every number and find the sum");

        streamMapping(numbers, s -> s * s);
        System.out.println("Cube every number and find the sum");
        System.out.println(numbers.stream().map(s -> s * s * s).reduce(0, Integer::sum));
        System.out.println("find sum of Odd numbers in a list");
        Predicate<Integer> integerPredicate = s -> s % 2 != 0;
        System.out.println(numbers.stream().filter(integerPredicate).reduce(0, Integer::sum));
        System.out.println("printing distinct values from the List");
        Consumer<Integer> println = System.out::println;
        numbers.stream().distinct().forEach(println);
        System.out.println("sorting the list");
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("Using comparator to sort list of String by their length");
        courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println("Collecting square of elements of a list into another list using collector");
        List<Integer> squaredNumbers = numbers.stream().map(s -> s * s).collect(Collectors.toList());
        System.out.println(squaredNumbers);
        System.out.println("Collecting even numbers elements from a list into another list using collector");
        squaredNumbers = numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(squaredNumbers);
        System.out.println("creating a list with length of all course titles");
        squaredNumbers = courses.stream().map(String::length).collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }

    private static void streamMapping(List<Integer> numbers, Function<Integer, Integer> integerIntegerFunction) {
        System.out.println(numbers.stream().map(integerIntegerFunction).reduce(0, Integer::sum));
    }

    public static void behaviorParameterization(List<Integer> numbers) {
        filterAndPrint(numbers, s -> s % 2 != 0);
        filterAndPrint(numbers, s -> s % 2 == 0);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate).forEach(System.out::println);
    }
}
