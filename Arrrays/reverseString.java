package Ejercicios.Arrrays;
import java.util.*; 
import java.util.Collection;
//Create a function that reverses a String.
// Other solution is to create an other array called reverseArray and make a for loop 
//in which we pass through the letters array and pass it to the reverseArray.
public class reverseString {
   
    public static void reverse1 (String word){
 
        if (word == null || word.length()<1){
            System.out.println("This function doesn´t work in that type of parameter");
        }
        String[] letters = word.split("");
        String[] letter = new String[1];
        letter[0]="a";
        int itemsNumber = letters.length-1;

        for (int i =0; i< letters.length/2; i++){
            letter[0]=letters[i];
            letters[i]= letters[itemsNumber]; 
            letters[itemsNumber]= letter[0];
            itemsNumber--;
        }

    }

    public static void reverse2(String word){
        String[] letters =word.split("");
        Collections.reverse(Arrays.asList(letters));
        System.out.println(letters[0]);
        System.out.println(letters[1]);
        System.out.println(letters[2]);
        System.out.println(letters[3]);

    }
    public static void main(String[] args) {
        reverse2("heloo");
    }
}
