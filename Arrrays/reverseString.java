package Ejercicios.Arrrays;
//Create a function that reverses a String 
public class reverseString {
   
    public static void reverse (String word){
 
        String[] letters = word.split("");
        String[] letter = new String[1];
        letter[0]="a";
        int leng = letters.length-1;

        for (int i =0; i< letters.length/2; i++){
            letter[0]=letters[i];
            letters[i]= letters[leng]; 
            letters[leng]= letter[0];
            leng--;
        }

    }
    public static void main(String[] args) {
        reverse("heloo");
    }
}
