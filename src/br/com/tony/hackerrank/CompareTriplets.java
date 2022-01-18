package br.com.tony.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
 */
public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> aliceList = Arrays.asList(1, 2, 3);
        List<Integer> bobList = Arrays.asList(3, 2, 1);
        System.out.println(compareTriplets(aliceList, bobList));
    }

    /*
        Se a[i] > b[i] , então Alice recebe 1 ponto.
        Se a[i] < b[i] , Bob recebe 1 ponto.
        Se a[i] = b[i] , nenhuma das pessoas recebe um ponto.
        Os pontos de comparação são o total de pontos que uma pessoa ganhou.

        Dados a e b, determine seus respectivos pontos de comparação.

        Exemplo

        a = [1, 2, 3]
        b = [3, 2, 1]
        Para os elementos *0*, Bob recebe um ponto porque a[0] .
        Para os elementos iguais a[1] e b[1] , nenhum ponto é ganho.
        Finalmente, para os elementos 2 , a[2] > b[2] então Alice recebe um ponto.
        A matriz de retorno é [1, 1] com a pontuação de Alice primeiro e a de Bob em segundo.
    * */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        var size = a.size();
        var alicePoints = 0;
        var bobPoints = 0;
        for (int i = 0; i < size; i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            }
            if (a.get(i) < b.get(i)) {
                bobPoints++;
            }
        }
        return List.of(alicePoints, bobPoints);
    }
}
