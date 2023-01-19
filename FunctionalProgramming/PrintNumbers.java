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

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
    //[12,9,13,4,6,2,5,7,8,8,89,2]
    //12
    //9
    //13
    //-....
    //We want to convert into a stream. 
    numbers.stream()
    .forEach(System.out::println);

   }

   private static boolean isEven(int number){
    return number%2==0;
   }
   private static void printEvenNumbets(List<Integer> numbers) {
     
    numbers.stream() //Lambda expression check for each number if divided by 2 is equal to 0
    .filter(number-> number%2 == 0) //filter - Only Allow even numbers
    .forEach(System.out::println);

   }
   
}
