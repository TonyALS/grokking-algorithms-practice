package br.com.tony.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {

    public static void main(String[] args) {
        var d = 10;
        var a = Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);
        System.out.println(rotLeft(a, d));

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        var listaFinal = new ArrayList<Integer>(a.size());
        List<Integer> integers = a.subList(d, a.size());

        listaFinal.addAll(integers);
        for (int i = 0; i < d; i++) {
            listaFinal.add(a.get(i));
        }
        return listaFinal;
    }
}
