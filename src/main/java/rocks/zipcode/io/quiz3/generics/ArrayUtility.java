package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType element1;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            element1 = array[i];
            for (int j = 0; j < array.length; j++){
                if (element1 == array[j]){
                    count++;
                }
            }
            if (count%2 != 0){
                return element1;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
