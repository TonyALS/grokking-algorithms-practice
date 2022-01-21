package br.com.tony.hackerrank;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
 *
 * */
public class StairCase {
    public static void main(String[] args) {
        staircase(10);

    }

    public static void staircase(int n) {
        String string = "#";
        String space = " ";
        int count = n - 1;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                stringBuilder.append(string.repeat(i));
                break;
            }
            stringBuilder
                    .append(space.repeat(count))
                    .append(string.repeat(i))
                    .append("\n");
            count--;
        }
        System.out.println(stringBuilder);
    }
}
