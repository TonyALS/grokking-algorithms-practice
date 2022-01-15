package br.com.tony.hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 *
 * https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * */
public class SockMerchant {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        System.out.println(sockMerchant(integers.size(), integers));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, List<Integer>> group = ar.stream().collect(Collectors.groupingBy(Integer::intValue));
        List<Integer> pairs = new ArrayList<>();
        group.forEach((k, v) -> pairs.add(v.size() / 2));
        return pairs.stream().reduce(Integer::sum).orElse(0);
    }
}
