/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
  

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.*/

public class lengthOfLastWord {
    

    public static int lenghtOfLastWord(String words){
        
        String[] wordsArray = words.split(" ");
        String[] answer = new String[1];
        int number=0;
        int i=wordsArray.length-1;
        while ( i >= 0){

            if (wordsArray[i].contains(" ")){
                i--;
            }else{
                answer[0] = wordsArray[i];
                number= answer[0].split("").length;
                i=-1;
            }
        }
        return number;
    }

    public static int lengthOfLastWord2(String s) {
        String[] str = s.split(" ");
        String lastWord = str[str.length-1];
        System.out.println(lastWord.length());
        return lastWord.length();
    }


    public static void main(String[] args) {
        lengthOfLastWord2("ab  ");
    }
}
