package br.com.tony.chapter1.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado uma lista de números inteiros, por exemplo, List.of(3666, 4566, 3565, 10), crie um algoritmo
 * que seja capaz de filtrar os possíveis números de quatro dígitos, em que cada dígito não seja maior
 * que o parâmetro maxDigit e que a soma de todos os dígitos seja igual a 21.
 *
 * @author tony
 */
public class DigitCalculator {

    public static void main(String[] args) {
        var numbers = List.of(3666, 4566, 3565, 10);
        System.out.println(calculation(numbers, 6));
    }


    /**
     *
     */
    public static List<Integer> calculation(List<Integer> numbers, int maxDigit) {
        var resultList = new ArrayList<Integer>();

        /*
         * Para cada número da lista
         * */
        numbers.forEach(n -> {
            /*
             * Transforma o número N em um array de chars
             * */
            int[] ints = n.toString().chars().toArray();
            int sum = 0;

            /*
            * Verifica se o número N possui 4 dígitos
            * */
            if (ints.length == 4) {
                /*
                 * Percorre cada char do array de 4 dígitos
                 * */
                for (int i : ints) {
                    /*
                    * Obtém o número corresponde ao código char:
                    * */
                    var numericValue = Character.getNumericValue(i);
                    /*
                     * Verifica se o número na posição i é menor ou igual ao maxDigit
                     * */
                    if (numericValue <= maxDigit) {
                        /*
                        * Soma os valores:
                        * */
                        sum += numericValue;
                    }
                }
            }
            if (sum == 21) resultList.add(n);
        });

        return resultList.size() > 0 ? resultList : null;
    }
}
