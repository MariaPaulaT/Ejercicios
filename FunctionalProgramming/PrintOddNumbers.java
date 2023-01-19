package Ejercicios.FunctionalProgramming;

import java.util.List;

public class PrintOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,3,4,5,6,7,3,6,6,4,4);
        printSquareOfElements(numbers);
    }

    private static void printOddNumbe(List<Integer> numbers) {
        numbers.stream()
        .filter(number->number%2!=0)
        .forEach(System.out::println);
    }

    private static void printSquareOfElements(List<Integer> numbers) {
        numbers.stream()
        .filter(number->number%2!=0)
        //mapping take each element and multiply it by two
        .map(number -> number* number)
        .forEach(System.out::println);
    }
}
