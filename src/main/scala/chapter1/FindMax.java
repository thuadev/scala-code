package chapter1;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static int findMax(List<Integer> temperatures) {
        int high = Integer.MIN_VALUE;
        for (Integer temperature : temperatures) {
            if (high < temperature) {
                high = temperature;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        List<Integer> temperatures = Arrays.asList(1, 2, 3, 4);
        System.out.println(findMax(temperatures));
    }
}
