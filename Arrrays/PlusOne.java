import java.util.List;

/*Companies
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits. */
 //Hay dos opciones
 //1. convertir todo el arreglo a un numero y sumarle 1
 //2. sumar al ultimo digito del arreglo un 1, si es 0, sumarle al numero anterior.
public class PlusOne {
    public static int[] plusOne(int[] digits){
       int longitud = digits.length-1;
       if(digits[longitud]==9){
        int i = longitud;
        while(digits[i]==9 && i>longitud){
            digits[i]=0;
            i--;
        }
        if(digits[i]==9){
            
        digits[i]++;
        digits[digits.length]=0;
        }
        digits[i]++;
       }else{
        digits[longitud]=digits[longitud]+1;
       }
       return digits;
    }

    public static int[] masUno (int[] nums) {
        

        return nums;
    }
    public static void main(String[] args) {
        int[] numer = new int[5];
        numer[0]=1;
        numer[1]=9;
        numer[2]=9;
        
        numer[3]=9;
        numer[4]=9;
        List<Integer> numbers = List.of(1,4,5,6,7,6);
        plusOne(numer);
    }
}
