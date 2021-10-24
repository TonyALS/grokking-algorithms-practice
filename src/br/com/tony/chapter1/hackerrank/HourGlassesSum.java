package br.com.tony.chapter1.hackerrank;

import java.util.ArrayList;
import java.util.OptionalInt;

public class HourGlassesSum {
    public static void main(String[] args) {
        int[][] arrays = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        /*

       -9 -9 -9  1 1 1
        0 -9  0  4 3 2
       -9 -9 -9  1 2 3


        0  0  8  6 6 0
        0  0  0 -2 0 0
        0  0  1  2 4 0
        * */
        var sumList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumList.add(sum(arrays, i, j));
            }
        }
        OptionalInt max = sumList.stream().mapToInt(n -> (int) n).max();
        System.out.println(max.orElse(0));
    }

    public static int sum(int[][] arr, int initialLine, int initialColumn) {
        return arr[initialLine][initialColumn] +
                arr[initialLine][initialColumn + 1] +
                arr[initialLine][initialColumn + 2] +
                arr[initialLine + 1][initialColumn + 1] +
                arr[initialLine + 2][initialColumn] +
                arr[initialLine + 2][initialColumn + 1] +
                arr[initialLine + 2][initialColumn + 2];
    }
}
