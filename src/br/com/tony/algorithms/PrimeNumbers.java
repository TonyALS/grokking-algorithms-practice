package br.com.tony.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Um número é considerado primo quando é divisível apenas por 1 e por ele mesmo.
 * */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O que vc deseja calcular? ");
        System.out.println("1 - Se um número x é primo");
        System.out.println("2 - Quais números são primos em uma lista de tamanho x");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Digite o número: ");
                int number = sc.nextInt();
                boolean result = calcPrimeByNumber(number);
                if (result) System.out.println("O número " + number + " é primo");
                if (!result) System.out.println("O número " + number + " não é primo");
                break;
            case 2:
                System.out.println("Digite o tamanho da lista: ");
                int n = sc.nextInt();
                System.out.println(calcPrimeByList(n));
                break;

            default:
                System.out.println("Opção incorreta");
        }
        sc.close();
    }


    public static boolean calcPrimeByNumber(int number) {
        int i = 2;
        boolean isPrime = true;
        while (i < number) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }

    public static List<Integer> calcPrimeByList(int size) {
        List<Integer> integerList = generateList(size);
        List<Integer> primeNumbers = new ArrayList<>();
        integerList.forEach(n -> {
            if (calcPrimeByNumber(n)) {
                primeNumbers.add(n);
            }
        });
        return primeNumbers;
    }

    public static List<Integer> generateList(int size) {
        List<Integer> integerList = new ArrayList<>(size - 1);
        for (int i = 2; i <= size; i++) {
            integerList.add(i);
        }
        return integerList;
    }
}
