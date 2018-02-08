package edu.tamu.amos.spring.testing;

/**
 * Created by Amos on 2018/2/8.
 */
public class MathUtil {
    public int sumUp(int[] input) {
        int result = 0;
        for (int element:
             input) {
            result += element;
        }
        return result;
    }
}
