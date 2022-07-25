package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String firstHalf = str.substring(0, indexToCapitalize);
        String capLetter = str.substring(indexToCapitalize, indexToCapitalize+1);
        String secondHalf = str.substring(indexToCapitalize+1);
        String finalString = firstHalf+capLetter.toUpperCase()+secondHalf;
        return finalString;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> subStrings = new ArrayList<>();
        String temp = "";
            for (int i=0; i< string.length(); i++){
                for(int j = i+1; j<=string.length(); j++){
                    temp = string.substring(i,j);
                    subStrings.add(temp);
                }
            }
            String[] newSubString = new String[subStrings.size()];
            newSubString = subStrings.toArray(newSubString);
        return newSubString;
    }

    public static Integer getNumberOfSubStrings(String input){
       // List<String> newList = new ArrayList<>();
        return getAllSubStrings(input).length-1;
    }
}
