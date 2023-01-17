package Ejercicios.HashTables;

import java.util.HashMap;
import java.util.Map;

//Given an array = [2,5,1,2,3,5,1,2,4]
//It shold return 2 because the 2 is the first number that repeats
public class RepeatedNumber {
    
public static int repeatedNumber(int[] numbers){
    Map<Integer, Integer> mapa = new HashMap <Integer, Integer>(numbers.length);
    for (int i =0; i< numbers.length; i++)
    {
     if(mapa.containsKey(numbers[i])){
        System.out.println(numbers[i]);
        return numbers[i];
     }else{
        mapa.put(numbers[i], 0);
     }
    }
    return 0;
}



    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros [0]= 5;
        numeros [1]= 2;
        numeros [2]= 3;
        numeros [3]= 4;
        numeros [4]= 5;

        repeatedNumber(numeros);

    }
}
