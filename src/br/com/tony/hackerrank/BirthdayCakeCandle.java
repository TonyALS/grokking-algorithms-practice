package br.com.tony.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 *
 * */

public class BirthdayCakeCandle {
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(4, 4, 1, 3);
        birthdayCakeCandles(candles);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer max = candles.stream()
                .max(Integer::compareTo)
                .orElse(0);
        List<Integer> collect = candles.stream()
                .filter(n -> Objects.equals(n, max))
                .collect(Collectors.toList());

        return collect.size();
    }
}
