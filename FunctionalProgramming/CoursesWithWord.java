package Ejercicios.FunctionalProgramming;

import java.util.List;

public class CoursesWithWord {
    public static void main(String[] args) {
        List<String> courses = List.of("java","python","CSS","HTML","JavaScript","Flutter", "AWS", "Spring boot");
        printNumberCharacters(courses);
    }

    private static void printAllCourWithSpring(List<String> courses) {

        courses.stream()
        .filter(course->course.contains("Spring"))
        .forEach(System.out::println);
    }

    private static void printNumberCharacters(List<String> courses) {

        courses.stream()
        .map(course -> course.length())
        .forEach(System.out::println);
    }
}
