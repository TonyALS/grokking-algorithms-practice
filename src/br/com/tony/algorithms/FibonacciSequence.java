package br.com.tony.algorithms;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(calcFibonacci(10));
    }

    static int calcFibonacci(int num) {
        if (num < 2) {
            return num;
        }
        return calcFibonacci(num - 1) + calcFibonacci(num - 2);
    }
}
