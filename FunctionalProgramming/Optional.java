package Ejercicios.FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class Optional {
    

    public static void main(String[] args) {
        List<String> fruits = List.of("banana","Apple","Grape");
        Predicate<? super String> Predicate = fruit -> fruit.startsWith("B");
        fruits.stream().filter(Predicate).findFirst();
    }
}
