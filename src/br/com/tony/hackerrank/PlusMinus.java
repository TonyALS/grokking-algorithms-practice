package br.com.tony.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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

        Double numOfPositiveNumbers = (double) arr.stream()
                .filter(positive -> positive > 0)
                .count();

        Double numOfNegativeNumbers = (double) arr.stream()
                .filter(negative -> negative < 0)
                .count();

        Double numOfZeros = (double) arr.stream()
                .filter(zero -> zero == 0)
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
