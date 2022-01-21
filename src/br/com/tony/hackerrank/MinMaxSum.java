package br.com.tony.hackerrank;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
 * */
public class MinMaxSum {
    public static void main(String[] args) {
        minMaxSum();

    }

    public static void minMaxSum() {
        List<Integer> arr = Arrays.asList(5, 5, 5, 5, 5);
        List<Long> sums = new ArrayList<>(arr.size());

        if (arr.stream().distinct().count() == 1) {
            Long value = Long.valueOf(arr.get(0));
            Long sum = arr.stream()
                    .map(Long::valueOf)
                    .reduce(0L, Long::sum);
            Long total = sum - value;
            System.out.println(total + " " + total);
            return;
        }


        for (int i = 0; i < arr.size(); i++) {
            Long removeSum = Long.valueOf(arr.get(i));
            Long sum = arr.stream()
                    .map(Long::valueOf)
                    .filter(n -> !Objects.equals(n, removeSum))
                    .reduce(0L, Long::sum);
            sums.add(sum);
        }

        Long max = sums.stream().max(Long::compareTo).orElse(0L);
        Long min = sums.stream().min(Long::compareTo).orElse(0L);
        System.out.println(min + " " + max);
    }
}
