package br.com.tony.chapter1.hackerrank;

import java.util.Arrays;

/**
 * @link https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
 *
 *
 * */

public class InheritanceChallenge {
    public static void main(String[] args) {
        int[] ints = new int[]{100,80};

        System.out.println(calculate(ints));

    }

    public static char calculate(int[] scores) {
        double average = Arrays.stream(scores)
                .average()
                .orElse(0);

        if (average >= 90 & average <= 100) {
            return 'O';
        }

        if (average >= 80 & average < 90) {
            return 'E';
        }

        if (average >= 70 & average < 80) {
            return 'A';
        }

        if (average >= 55 & average < 70) {
            return 'P';
        }

        if (average >= 40 & average < 55) {
            return 'D';
        }

        if (average < 40) {
            return 'T';
        }

        return 'Z';
    }
}


