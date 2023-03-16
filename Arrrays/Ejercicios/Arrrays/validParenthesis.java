package Ejercicios.Arrrays;

/** Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.*/
public class validParenthesis {

    public static boolean validP (String word){
        boolean resp = false;
        boolean noEs = true;
        String[] lista=word.split("");
        for (int i =0; i<lista.length-1; i++){
            String siguiente = lista[i+1];
            if(lista[i].equals("(") && siguiente.equals(")")){
                resp = true;
                i++;
            }else if(lista[i].equals("{") && siguiente.equals("}")){
                resp = true;
                i++;
            }    
            else if(lista[i].equals("[") && siguiente.equals("]")){
                resp= true;
                i++;
            }else{
            noEs = false;
            }
        }
         if (noEs == false){
            resp = false;
         }
        System.out.println(resp);
        return resp;
    }
    public static void main(String[] args) {
        validP("{[]}");
        
    }
}