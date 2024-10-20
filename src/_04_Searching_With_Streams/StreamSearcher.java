package _04_Searching_With_Streams;

import java.util.Arrays;

public class StreamSearcher {
    /*
     * Use stream methods to return the number of times a string appears
     * in the array of strings.
     *
     * The filter() and count() stream methods may be useful here.
     */
    public int containsCount(String[] strArr, String strToCount) {
        return (int) Arrays.stream(strArr).filter((s)->s==strToCount).count();
        
    }
}
