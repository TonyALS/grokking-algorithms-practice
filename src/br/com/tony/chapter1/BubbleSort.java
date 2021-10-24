package br.com.tony.chapter1;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        var arr = randomArray(10);
        System.out.println("Array sem ordenar: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            /*
             * j inicia de i + 1 pois precisamos testar o elemento que está no índice imediatamente
             * posterior a i
             * */
            for (int j = i + 1; j < arr.length; j++) {
                /*
                 * Se o elemento da posição arr[i] é maior que arr[j] precisamos trocá-los de
                 * posição. Exemplo:
                 * [6, 3, 5]
                 * arr[i] == 6
                 * arr[j] == 3
                 * Assim arr[i] recebe o valor que tinha em arr[j] e arr[j] recebe o valor que tinha
                 * em arr[i], resultado:
                 * [3, 6, 5]
                 * */
                if (arr[i] > arr[j]) {
                    var aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static int[] randomArray(int tam) {
        var arr = new int[tam];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        return arr;
    }
}
