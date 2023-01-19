package Ejercicios.FunctionalProgramming;

import java.util.List;

public class PrintOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,3,4,5,6,7,3,6,6,4,4);
        printOddNumbe(numbers);
    }

    private static void printOddNumbe(List<Integer> numbers) {
        numbers.stream()
        .filter(number->number%2!=0)
        .forEach(System.out::println);
    }
}
