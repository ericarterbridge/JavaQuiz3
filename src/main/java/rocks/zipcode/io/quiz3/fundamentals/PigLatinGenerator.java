package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        List<String> newList = new ArrayList<>();
        String temp = "";
        String returnString = "";
        String[] newArray = str.split(" ");
        for (int i = 0; i < newArray.length; i++) {
            if (VowelUtils.startsWithVowel(newArray[i])) {
                temp = newArray[i] +"way";
                newList.add(temp);
            } else if (!VowelUtils.startsWithVowel(newArray[i]) && VowelUtils.hasVowels(newArray[i])) {
                String firstHalf = newArray[i].substring(VowelUtils.getIndexOfFirstVowel(newArray[i]));
                String secondHalf = newArray[i].substring(0, VowelUtils.getIndexOfFirstVowel(newArray[i]));
                temp = firstHalf + secondHalf + "ay";
                newList.add(temp);
            }else {
                temp = newArray[i] + "ay";
                newList.add(temp);
            }
        } for (int i = 0; i<newList.size()-1; i++){
            returnString += newList.get(i) + " ";
        }return returnString + (newList.get(newList.size()-1));
    }
}
