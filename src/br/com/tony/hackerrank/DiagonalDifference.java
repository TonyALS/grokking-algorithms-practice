package br.com.tony.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 *
 * */
public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12));
        System.out.println(diagonalDifference(arr));
    }

    /*
    * Exemplo:
    * 1, 2, 3
    * 4, 5, 6
    * 9, 8, 9
    *
    * Deve-se somar a diagonal da esquerda para direita: 1 + 5 + 9 = 15
    * Deve-se somar a diagonal da direita para esquerda: 3 + 5 + 9 = 17
    * Retornar a diferença 15 - 17 == 2
    * */
    public static int diagonalDifference(List<List<Integer>> arr) {
        /*
        * LeftDiagonal: 0,0 1,1 2,2
        * */
        var leftDiagonalSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonalSum = leftDiagonalSum + arr.get(i).get(i);
        }

        // RightDiagonal: 0,2 1,1 2,0
        var rightDiagonalSum = 0;
        var size = arr.size();
        for (List<Integer> integerList : arr) {
            rightDiagonalSum = rightDiagonalSum + integerList.get(size - 1);
            size--;
        }

        /*
        * O resultado deve ser absoluto (se for valor negativo devemos converter para positivo)
        * Para a conversão basta usar o Math.abs()
        * */
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }
}
