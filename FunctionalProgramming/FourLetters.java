package Ejercicios.FunctionalProgramming;

import java.util.List;

public class FourLetters {
    public static void main(String[] args) {
        List<String> courses = List.of("java","python","CSS","HTML","JavaScript","Flutter", "AWS", "Spring boot");
        printAllWith4letters(courses);
    }

    private static void printAllWith4letters(List<String> courses) {
    courses.stream()
    .filter(course -> course.split("").length>4)
    .forEach(System.out::println);
    }
}
