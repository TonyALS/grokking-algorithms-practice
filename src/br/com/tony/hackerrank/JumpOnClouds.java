package br.com.tony.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * */

public class JumpOnClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds());
    }

    /*
     * Formato de entrada: [0, 1, 0, 0, 0, 1, 0]
     * 0 -> Caminho seguro
     * 1 -> Caminho inseguro
     * Pode pular para qualquer nuvem segura cujo indice seja posicao atual + 1 ou 2.
     * Determinar o menor numero de saltos que são necessários para chegar ao final
     * sem passar pelo caminho inseguro.
     * */
    public static int jumpingOnClouds() {
        List<Integer> c = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
        int jumps = 0;
        int count = 0;
        while (count < c.size() - 1) {
            if (count + 2 < c.size()) {
                if (c.get(count + 2) == 0) {
                    jumps++;
                    count = count+2;
                } else {
                    jumps++;
                    count++;
                }
            } else {
                jumps++;
                count++;
            }
        }
        return jumps;
    }

}
