package br.com.tony.hackerrank;

import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
 */
public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L));
    }

    public static long repeatedString(String s, long n) {
        /*
         * Se a string contém um único caractere e ele é "a", então teremos n vezes a letra a.
         * */
        if (s.length() == 1 & s.equals("a")) {
            return n;
        }

        /*
         * Se o tamanho for 1 e não tiver caído na condicional anterior, então não existe caractere "a".
         * */
        if (s.length() == 1) {
            return 0;
        }

        /*
         * Para o algoritmo ser performático, devemos evitar percorrer uma string de tamanho n.
         * A solução é a seguinte:
         * */

        // 1º contar quantos caracteres "a" temos na String s:
        long numCharacterAInStrinS = Stream.of(s.split("")).filter(letter -> letter.equals("a")).count();

        // 2º Dado que sabemos quantos caracteres "a" temos na string s, agora temos que
        // descobrir quantas vezes completas a String s cabe dentro do tamanho N. Para isso
        // basta pegar o resultado da divisão de s.length() / n
        long countNumString = n / s.length();
        // Agora, multiplicamos countNumString por numCharacterAInStrinS e temos quantas ocorrências de "a"
        // estarão presentes na string principal:
        long principalCountResult = countNumString * numCharacterAInStrinS;

        // O principalCountResult contém somente a quantidade de caracteres "a" dentro do resultado
        // arredondado da quantidade de vezes que string s cabe dentro do tamanho N.
        // Porém, devemos calcular o resto e saber quantas ocorrências de "a" teríamos na string "quebrada".
        // Para isso, poderíamos criar uma substring com o resto da divisão de n / s.length() e assim ter
        // uma string proporcional para completar a contagem:
        long restoDivisao = n % s.length();
        String proporcionalString = s.substring(0, (int) (restoDivisao));
        //  Com a proporcionalString em mãos, basta contar as ocorrências de "a" nela a adicionar ao principalCountResult:
        long proporcionalCount = Stream.of(proporcionalString.split(""))
                .filter(letter -> letter.equals("a")).count();

        //  Retornamos a soma:
        return proporcionalCount + principalCountResult;
    }
}
