package FUNCTIONAL_PROGRAMMING;

import java.util.List;

public class StructeredList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> Courses=List.of("java","Spring","Python","Flask","Django","REST","Machine Learning");
//        printAllNumbersInList(numbers);
        printAllEvenNumbersInList(numbers);
        printAllOddNumbersInList(numbers);
        printAllCourses(Courses);

    }

    private static void printAllCourses(List<String> courses){
        courses.stream().forEach(System.out::println);
        System.out.println("Print Courses contains Spring");
        courses.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
        System.out.println("Print Courses of length more than 4");
        courses.stream().filter(s->s.length()>=4).forEach(System.out::println);
        System.out.println("Print length of the course name");
        courses.stream().map(String::length).forEach(System.out::println);
    }

    private static void printAllEvenNumbersInList(List<Integer> numbers) {
        System.out.println("print all even numbers");
        numbers.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
        System.out.println("print squares fo all even numbers");
        numbers.stream().filter(s->s%2==0).map(e->e*e).forEach(System.out::println);
        System.out.println("print cube of all odd numbers");
        numbers.stream().filter(s->s%2!=0).map(e->e*e*e).forEach(System.out::println);

    }

    private static void printAllOddNumbersInList(List<Integer> numbers) {
        numbers.stream().
                filter(s -> s % 2 != 0).
                forEach(System.out::println);
    }

    public static void Print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInList(List<Integer> integers) {
//        Structural Programming
        for (int e : integers) {
            System.out.println(e);
        }
//        Functional Programming
        integers.stream().forEach(StructeredList::Print);
    }
}
