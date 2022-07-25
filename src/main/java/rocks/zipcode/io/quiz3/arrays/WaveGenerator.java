package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        int charCount = 0;
        int notCharCount = 0;
        int indexCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                charCount++;
            } else {
                notCharCount++;
            }
        }
        String[] waveArr = new String[charCount];
        for (int i = 0; i< str.length(); i++){
           if(Character.isLetter(str.charAt(i))) {
                String beginning = str.substring(0, i);
                String capital = str.substring(i, i + 1).toUpperCase();
                String end = str.substring(i + 1);

                waveArr[indexCount] = beginning + capital + end;
                indexCount ++;
            } else {
               //indexCount += 1;
           }
        }
        return waveArr;
    }
}
