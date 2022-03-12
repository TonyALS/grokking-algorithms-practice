package br.com.tony.chapter1.sort;

import java.util.Arrays;

/**
 * Entrada: uma sequência de N números (a1, a2, a3, ..., aN)
 * Saída: A sequência de entrada reordenada tal que a′1 ≤ a′2≤ ... ≤ a′n
 *
 * */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    /**
     * Algoritmo pouco eficiente para arrays grandes.
     * Lógica:
     * Preciso de 2 índices, sendo i o elemento atual e j os elementos aos quais o atual está sendo
     * comparado.
     * A posição de i começa em 0 para buscar o primeiro número do array
     * A posição de j será sempre i + 1, pois deve-se comparar uma posição à frente de i, e
     * caso o j inicia-se somente em 1, toda vez que o loop de i fosse concluído, j voltaria para
     * 1 e em dado momento i seria comparado com valores que já foram ordenados.
     * */
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
