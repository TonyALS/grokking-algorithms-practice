package br.com.tony.hackerrank;

import java.util.Objects;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
 * */

public class CountValleys {
    public static void main(String[] args) {

    }

    public static int countValleys(int steps, String path) {
        int count = 0;
        int valley = 0;
        char[] chars = path.toCharArray();
        for (char aChar : chars) {
            if (Objects.equals(String.valueOf(aChar), "U")) {
                count++;
            }

            if (Objects.equals(String.valueOf(aChar), "D")) {
                count--;
                if (count == -1) {
                    valley++;
                }
            }
        }
        return valley;
    }
}
