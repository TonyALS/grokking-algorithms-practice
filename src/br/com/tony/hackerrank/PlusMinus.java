package br.com.tony.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
 */
public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        Double listSize = (double) arr.size();

        Predicate<Integer> isGreaterThanZero = num -> num > 0;
        Predicate<Integer> isLessThanZero = num -> num < 0;
        Predicate<Integer> isEqualZero = num -> num == 0;

        Double numOfPositiveNumbers = (double) arr.stream()
                .filter(isGreaterThanZero)
                .count();

        Double numOfNegativeNumbers = (double) arr.stream()
                .filter(isLessThanZero)
                .count();

        Double numOfZeros = (double) arr.stream()
                .filter(isEqualZero)
                .count();

        String positiveProp = String
                .format(Locale.US, "%.6f", numOfPositiveNumbers / listSize);
        String negativeProp = String
                .format(Locale.US,"%.6f", numOfNegativeNumbers / listSize);
        String zeroProp = String
                .format(Locale.US,"%.6f", numOfZeros / listSize);

        System.out.println(positiveProp);
        System.out.println(negativeProp);
        System.out.println(zeroProp);
    }
}
