package Ejercicios.FunctionalProgramming;

import java.util.List;

public class printAllCourses {
    public static void main(String[] args) {
        List<String> courses = List.of("java","python","CSS","HTML","JavaScript","Flutter", "AWS");
        printAllCour(courses);
    }

    private static void printAllCour(List<String> courses) {
        courses.stream()
        .forEach(System.out::println);
    }
}
