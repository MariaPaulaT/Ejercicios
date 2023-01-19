package Ejercicios.FunctionalProgramming;

import java.util.List;

//Print all the numbers of a list
public class PrintNumbers {
    public static void main (String[] args){
        printAllNumbersInListStructured(List.of(12,9,4,5,6,7,7,88,88,3));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
    //How to loop the numbers?
    for(int number:numbers){
        System.out.println(number);
    }
    }
}
