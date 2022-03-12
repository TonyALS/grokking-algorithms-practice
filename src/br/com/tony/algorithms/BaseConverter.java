package br.com.tony.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BaseConverter {
    public static void main(String[] args) {
        String s = Integer.toString(132);
        char[] charArray = s.toCharArray();
        System.out.println(charArray.length);

        System.out.println(charArray);
        List<Double> result = new ArrayList<>();
        int i = 0;
        int aux = charArray.length - 1;
        while (i < charArray.length) {
            int value = Character.getNumericValue(charArray[i]);
            result.add((Math.pow(4, aux)) * value);
            i++;
        }

        System.out.println(result.stream().reduce(Double::sum));
    }
}
