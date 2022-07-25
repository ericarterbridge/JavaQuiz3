package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        //word.toLowerCase();
        for(int i = 0; i< word.length(); i++){
            if (isVowel(word.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int indexOfVowel = 0;
        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
//                    || word.charAt(i) == 'u') {
                if (isVowel(word.charAt(i))){
                return i;
            }
        }return -1;
    }


    public static Boolean startsWithVowel(String word) {
//        if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
//                || word.charAt(0) == 'u') {
//            return true;
//        }
//        return false;
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            return true;
        }
        return false;
    }
}
