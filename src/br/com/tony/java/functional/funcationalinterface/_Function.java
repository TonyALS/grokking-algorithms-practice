package br.com.tony.java.functional.funcationalinterface;

import java.util.function.Function;

/**
 * Represents a function that accepts one argument and produces a result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object)}.
 *
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 *
 * @since 1.8
 */
public class _Function {
    public static void main(String[] args) {

        int increment = increment(0);
        System.out.println(increment);
        int incrementFunction = incrementByOneFunction.apply(0);
        System.out.println(incrementFunction);
        int multiply = multipleBy10Function.apply(1);
        System.out.println(multiply);

        /*
        * Combine two Functions:
        * */
        Function<Integer, Integer> addByOneAndMultiplyBy10 = incrementByOneFunction
                .andThen(multipleBy10Function);

        System.out.println(addByOneAndMultiplyBy10.apply(4));
    }

    //  Implementation with Function
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    //  Implementation with Function
    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;

    //  Implementation without Function
    static int increment(int number) {
        return number + 1;
    }
}
