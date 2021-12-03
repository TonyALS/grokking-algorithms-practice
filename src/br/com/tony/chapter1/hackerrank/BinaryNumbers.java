package br.com.tony.chapter1.hackerrank;

/**
* Link do desafio: https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
*
* */
public class BinaryNumbers {
    public static void main(String[] args) {
        //  Expect result is 1:
        System.out.println(binaryNumbers(5));
        //  Expect result is 2:
        System.out.println(binaryNumbers(13));
    }

    public static int binaryNumbers(int n) {
        String binaryString = Integer.toBinaryString(n);
        char[] charArray = binaryString.toCharArray();
        int count = 0;
        int max = 0;

        for (int i : charArray) {
            if (Character.getNumericValue(i) == 1) {
                count = count + 1;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
